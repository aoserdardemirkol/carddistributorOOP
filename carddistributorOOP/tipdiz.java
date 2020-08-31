package com.carddistributorOOP;

import java.util.Comparator;

public class tipdiz implements Comparator<Kart> {
    public int compare(Kart a, Kart b) {
        return a.tip() - b.tip();
    }
}