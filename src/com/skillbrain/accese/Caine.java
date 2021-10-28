package com.skillbrain.accese;

import com.skillbrain.AnimalDeCompanie;
import com.skillbrain.Mamifer;

public class Caine implements Mamifer, AnimalDeCompanie {
    public int numarPicioare = 4;

    public void mananca() {
        System.out.println("Eu sunt un caine si imi place sa mananc oase");
    }

    @Override
    public void sunet() {
        System.out.println("Ham ham");
    }

    @Override
    public void reproducere() {
        System.out.println("Eu sunt un caine si imi hranesc puii cu lapte");
    }

    @Override
    public void vaneaza() {
        System.out.println("Eu sunt un caine de companie si nu pot vana");
    }
}
