package com.company;

public abstract class Vorschrift {

    private int zahl1;
    private int zahl2;

    public int getZahl1() {
        return zahl1;
    }

    public int getZahl2() {
        return zahl2;
    }

    public void setZahl1(int zahl1) {
        this.zahl1 = zahl1;
    }

    public void setZahl2(int zahl2) {
        this.zahl2 = zahl2;
    }
    //abstrakte Methode mit dem Namen berechneErgebnis, returnt einen Integer
    public abstract int berechneErgebnis();
}
