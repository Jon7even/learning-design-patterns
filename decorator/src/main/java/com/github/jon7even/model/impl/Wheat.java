package com.github.jon7even.model.impl;

import com.github.jon7even.model.Pasta;

public class Wheat extends Pasta {

    public Wheat() {
        description = "Пшеничная лапша";
    }

    @Override
    public double cost() {
        return 51.33;
    }
}
