package com.skillbrain;

public class SubClasa extends SuperClasa {

    @Override
    public void metodaImplicita() {
        System.out.println("Metoda implicita din subclasa");
    }

    public void metodaImplicita(String parametru) {
        System.out.println("Metoda supraincarcata, care a primit paramtru " + parametru);
    }

    @Override
    public void metodaProtected() {
        System.out.println("Metoda protected din subclasa");
    }

    @Override
    public void metodaPublica() {
        System.out.println("Metoda publica din subclasa");
    }

}
