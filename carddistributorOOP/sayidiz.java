package com.carddistributorOOP;

import java.util.Comparator;

public class sayidiz implements Comparator <Kart> {
    public int compare(Kart a, Kart b){
        return a.deger - b.deger;
    }

}