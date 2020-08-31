package com.carddistributorOOP;

import java.util.Random;

public class Deste {
    Random random = new Random();

    int destesayisi;
    int kart_sayisi;

    private Kart[] deste;

    public Deste(int destesayisi) {
        this.destesayisi = destesayisi;
        this.kart_sayisi = this.destesayisi * 52;

        // vale = 11 - kız = 12 - papaz = 13 - as = 14
        int[] degerler = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        String[] tipler = {"Sinek", "Karo", "Maça", "Kupa"};

        deste = new Kart[kart_sayisi];

        for (int i = 0; i < deste.length; i++){
            deste[i] = new Kart(degerler[i % 13], tipler[(i / 13) % 4]);
        }
    }

    public void Karistir(){
        for (int ilk = 0; ilk < deste.length; ilk++){
            int ikinci = random.nextInt(kart_sayisi);
            Kart tutucu = deste[ilk];
            deste[ilk] = deste [ikinci];
            deste[ikinci] = tutucu;
        }
    }

    public Kart getDeste(int i) {
        return deste[i];
    }
    public void setDeste(Kart[] deste) {
        this.deste = deste;
    }
}