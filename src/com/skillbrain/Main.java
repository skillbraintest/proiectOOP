package com.skillbrain;

import com.skillbrain.accese.Caine;

public class Main {

    public static void main(String[] args) {

    }

    public void polimorfism() {
        SubClasa subClasa = new SubClasa();
        subClasa.metodaImplicita();
        subClasa.metodaImplicita("alabala");


        SuperClasa obiect = new SubClasa();
        obiect.metodaImplicita();
    }

    public void incapsulare() {
        Labrador labrador = new Labrador();
        System.out.println(labrador.getRasa());
    }

    public void abstractie() {
        Caine caine = new Caine();

        caine.mananca();
        caine.sunet();
        caine.vaneaza();
        caine.reproducere();
    }

    public void mostenire() {
        Labrador labrador = new Labrador();

        System.out.println(labrador.numarPicioare);

        Chiuaua chiuaua = new Chiuaua();
        System.out.println(chiuaua.numarPicioare);
    }


    public void exemplificarePersoana() {
        Persoana persoana = new Persoana();

        System.out.println(persoana.nume);
        System.out.println(persoana.varsta);
        System.out.println(persoana.adresa);

        persoana.plimbare();
        persoana.gateste();

        System.out.println(Persoana.SPECIE);
        System.out.println(Persoana.respira(0));

        System.out.println(persoana.SPECIE);
        System.out.println(persoana.respira(12));
    }

    public void exemplificareClasaAbstracta() {
        Cerc cerc = new Cerc(3.2, 10.1, -5.5);

        System.out.println(cerc.raza);
        System.out.println(cerc.x);
        System.out.println(cerc.y);

        System.out.println(cerc.getX());
        System.out.println(cerc.getY());

        System.out.println(cerc.aria());
        System.out.println(cerc.perimetru());
    }

    public void exemplificareInterfete() {
        Caine caine = new Caine();

        caine.mananca();
        caine.sunet();
        caine.reproducere();
        caine.vaneaza();

        System.out.println(caine.inteligenta);
    }

}
