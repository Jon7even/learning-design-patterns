package com.github.jon7even.model.impl;

import com.github.jon7even.model.Pasta;

public class Egg extends Pasta {
    public Egg() {
        description = "Яичная лапша";
    }

    @Override
    public double cost() {
        return 52.37;
    }
}
