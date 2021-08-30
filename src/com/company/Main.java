package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Summe s = new Summe();
        // zahl1 und zahl2 sind 0, Standartkonstruktor
        System.out.println(s.berechneErgebnis());
        s.setZahl1(5);
        s.setZahl2(15);
        System.out.println(s.berechneErgebnis());

        Differenz d = new Differenz();
        d.setZahl1(5);
        d.setZahl2(15);
        System.out.println(d.berechneErgebnis());

    }
}
