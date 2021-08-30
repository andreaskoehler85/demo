package com.company;

public class Summe extends Vorschrift {

    @Override
    public int berechneErgebnis() {
        int ergebnis = getZahl1()+getZahl2();
        return ergebnis;
    }
}
