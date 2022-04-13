package com.company;

import com.company.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Library lib1 = new Library();
        lib1.numberOfRomanceBooks = 4;
        lib1.numberOfCrimeBooks = 6;
        lib1.numberOfActionsBooks = 8;

        System.out.println(lib1.TotalNumberOfBooks());
        Library.shelfs = 5;
        Library.NumberOfSelfs();

        Car car = new Car();
        Car.CarData();
        Car car2 = new Car();
        car2.maxSpeed = 230;
        Car.CarData();
        Kuchnia kuchnia = new Kuchnia();
        List<Pokoj> listaPokoji = Arrays.asList(new Pokoj("Salon"),new Pokoj("Sypialnia 1"), new Pokoj("Sypialnia 2"));
        Dom dom = new Dom(kuchnia,listaPokoji);
        dom.ListaPokojow();

    }
}