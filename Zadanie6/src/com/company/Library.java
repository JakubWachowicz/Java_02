
package com.company;

public class Library {

    public int numberOfActionsBooks;
    public int numberOfRomanceBooks;
    public int numberOfCrimeBooks;
    public static int shelfs;

    public int TotalNumberOfBooks(){
        return numberOfActionsBooks+numberOfCrimeBooks+numberOfRomanceBooks;
    }


    public static void NumberOfSelfs(){
        System.out.println("Shelfs: " +shelfs );
    }
}