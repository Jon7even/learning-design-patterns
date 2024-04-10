package com.github.jon7even.model.impl;

import com.github.jon7even.model.Pasta;

public class Funchosa extends Pasta{
    public Funchosa() {
        description = "Фунчоза";
    }

    @Override
    public double cost() {
        return 57.98;
    }
}

