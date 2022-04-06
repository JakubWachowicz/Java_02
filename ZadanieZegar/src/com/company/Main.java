package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Integer> listOFNumbers = GenerateList();
        Clock clock = new Clock(listOFNumbers);


    }




    public static List<Integer> GenerateList(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOFNumbers = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            listOFNumbers.add(scanner.nextInt());

        }
        return listOFNumbers;

    }
}


