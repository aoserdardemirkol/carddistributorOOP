package com.carddistributorOOP;

import java.util.ArrayList;

public class Oyuncu {
    private int numara;
    private ArrayList<Kart> el;

    public ArrayList<String> diz;

    public Oyuncu(int numara, ArrayList<Kart> el) {
        this.numara = numara;
        this.el = el;
    }

    public int getNumara() {
        return numara;
    }
    public void setNumara(int numara){
        this.numara = numara;
    }

    public ArrayList<Kart> getEl() {
        return el;
    }
    public void setEl(ArrayList<Kart> el){
        this.el = el;
    }

    public String toString(){
        return el + "";
    }
}