package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Zadanie1();
        Zadanie2();
        Zadanie3();
        Zadanie4();
    }
    public static void Zadanie1(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo");
        String name = scanner.nextLine();

        int wordLenght = name.length();
        char multiplayedLetter = name.charAt(wordLenght-1);
        int numberOfMultiplayedLetters =0;

        for(char letter:name.toCharArray()) {
            if(letter == multiplayedLetter) numberOfMultiplayedLetters++;
        }
        System.out.println("Ostatnia litera " + multiplayedLetter + "występuje w wyrazie jeszcze " + (numberOfMultiplayedLetters-1) + " razy");
    }
    public static void Zadanie2() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo");
        StringBuffer wordToReverse = new StringBuffer(scanner.nextLine());
        System.out.println(wordToReverse.reverse());



    }
    public static void Zadanie3() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo");
        StringBuffer wordToCheck = new StringBuffer(scanner.nextLine());
        String s1 = wordToCheck.toString();
        wordToCheck = wordToCheck.reverse();
        String s2 = wordToCheck.toString();

        if(s1.equals(s2) == true){
            System.out.println("Podane słowo jest palindromem");

        }else{
            System.out.println("Podane słowo nie jest palindromem");
        }


    }

    public static void Zadanie4() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo");
        String sentenceToSum = new String(scanner.nextLine());
        int sum = 0;

        for(char letter:sentenceToSum.toCharArray()){

            if(Character.isDigit(letter)==true ){
                sum+=Character.getNumericValue(letter);
            }

        }
        System.out.println(sum);


    }
}
