package com.carddistributorOOP;

import java.util.*;

public class Masa {
    public static void main(String[] args){
        Scanner klavye = new Scanner(System.in);
        System.out.print("Oyuncu sayısını giriniz: ");
        int oyuncusayisi = klavye.nextInt();
        System.out.print("Deste sayısını giriniz: ");
        int destesayisi = klavye.nextInt();

        Deste deste = new Deste(destesayisi);
        deste.Karistir();

        ArrayList<Oyuncu> oyuncular = new ArrayList<>();

        for (int i = 0; i < oyuncusayisi; i++) {
            oyuncular.add(new Oyuncu(i, new ArrayList<Kart>()));
        }

        for (int i = 0; i < destesayisi * 52; i++) {
            oyuncular.get(i % oyuncusayisi).getEl().add(deste.getDeste(i));
        }

        for (int i = 0; i < oyuncusayisi; i++) {
            Collections.sort(oyuncular.get(i).getEl(), new sayidiz());
            Collections.sort(oyuncular.get(i).getEl(), new tipdiz());

            System.out.println((i+1)+" Oyuncusunun Kartları :");

            System.out.println(oyuncular.get(i).toString());
        }
    }
}