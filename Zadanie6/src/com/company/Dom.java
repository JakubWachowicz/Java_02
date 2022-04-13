package com.company;

import java.util.ArrayList;
import java.util.List;

public class Dom {

    int liczbaOkien;
    Kuchnia kuchnia;
    List<Pokoj> listaPokojis = new ArrayList<>();

    public Dom(Kuchnia kuchnia, List<Pokoj> listaPokoji) {
        this.kuchnia = kuchnia;
        this.listaPokojis = listaPokoji;
    }

    public void ListaPokojow() {
        for (Pokoj pokoj : listaPokojis) {
            System.out.println(pokoj.name);
        }
        System.out.println("kuchnia");
    }
}
