
package com.company;

public class Car {

    static int numberOfCars;
    static int numberOfWheels;

    public Car(){
        numberOfCars++;
    }

    public int maxSpeed;


    public void IncreseMaxSpeed(){
        maxSpeed=+10;
    }
    public void ChangeMaxSpeed(int speed){
        maxSpeed = speed;
    }

    public static void CarData(){
        System.out.println("Number of wheels" + numberOfWheels);
        System.out.println("Number of wheels" + numberOfCars);


    }






}