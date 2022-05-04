package com.company;

public class KolorowyPunkt extends Punkt{
    public Kolor color;


    public KolorowyPunkt(int x, int y,Kolor kolor) {
        super(x, y);
        this.color = kolor;
    }


    public enum Kolor{
        red,blue,black,green

    }
}
