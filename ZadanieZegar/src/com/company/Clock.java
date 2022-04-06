package com.company;

import java.util.ArrayList;
import java.util.List;

public class Clock {
    private int[] tab = new int[4];
    private int iteration = 0;
    private List<Integer> listOfNumbers = new ArrayList<>();
    private List<Integer> CopylistOfNumbers;
    private int actualPosition = 0;
    private boolean isValid = true;


    public Clock(List<Integer> listOfNumbers) {
        this.CopylistOfNumbers = listOfNumbers;
        Start();
        Print();

    }

    private void Start() {
        isValid = true;
        if(iteration > 2){
            System.out.println("Z podanych liczb nie da się utworzyć godziny");
        }
        else{

            Copy();
            Find();

        }


    }



    private void Find() {

        if(isValid == true && iteration == 0){
            SearchForHighestNumber(2);
        }
        else if (isValid ==true && iteration == 1){
            SearchForHighestNumber(1);
        }
        else if (isValid ==true && iteration == 2){
            SearchForHighestNumber(0);
        }

        if (tab[0] == 2 && isValid == true) {
            SearchForHighestNumber(3);
        }
        else if(isValid == true){
            SearchForHighestNumber(9);
        }
        if(isValid){SearchForHighestNumber(5);}
        if(isValid)SearchForHighestNumber(9);
        if(isValid == false){Start();}
    }

    private void Copy() {
        listOfNumbers.clear();
        for(int i = 0;i<4;i++){
            listOfNumbers.add(CopylistOfNumbers.get(i));
        }
        actualPosition = 0;
        isValid = true;
    }


    private void SearchForHighestNumber(int highest) {

        int check = 0;
        for (int i = highest; i>-1; i--) {
            if (listOfNumbers.contains(i)) {
                AddAndRemove(i);
                check = 1;
                break;

            }
        }
        if (check == 0) {
            iteration++;
            isValid = false;

        }
    }

    private void AddAndRemove(int i) {
        tab[actualPosition] = i;

        listOfNumbers.remove(Integer.valueOf(i));
        actualPosition++;
    }

    public void Print(){
        for (int item:tab) {
            System.out.print(item);
        }
    }
}

