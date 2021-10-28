package com.skillbrain;

import com.skillbrain.accese.Caine;

public class Labrador extends Caine {
    private String rasa = "labrador";

    public String getRasa() {
        return rasa;
    }

    @Override
    public void mananca() {
        System.out.println("Eu sunt un labrador si imi place Pedigree");
    }
}
