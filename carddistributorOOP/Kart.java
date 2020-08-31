package com.carddistributorOOP;

import java.util.HashMap;

public class Kart {
    private String tip;
    int deger;

    public Kart(int deger, String tip){
        this.tip = tip;
        this.deger = deger;
    }

    public int tip() {
        HashMap<String, Integer> tipMap = new HashMap<String, Integer>();
        tipMap.put("Sinek", 0);
        tipMap.put("Karo", 1);
        tipMap.put("Maça", 2);
        tipMap.put("Kupa", 3);

        return tipMap.get(tip);
    }

    public String getTip(){
        return tip;
    }
    public void setTip(String tip){
        this.tip = tip;
    }

    public int getDeger(){
        return deger;
    }
    public void setDeger(int deger){
        this.deger = deger;
    }

    public String toString(){
        return tip + " " + deger;
    }
}