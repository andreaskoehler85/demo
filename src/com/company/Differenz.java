package com.company;

public class Differenz extends Vorschrift{
    @Override
    public int berechneErgebnis() {
        int ergebnis = getZahl1()-getZahl2();
        return ergebnis;
    }
}
