package com.github.jon7even.model.decorator.impl;

import com.github.jon7even.model.Pasta;
import com.github.jon7even.model.decorator.SauceDecorator;

public class CreamySauce extends SauceDecorator {
    private final Pasta pasta;

    public CreamySauce(Pasta pasta) {
        this.pasta = pasta;
    }

    @Override
    public double cost() {
        return 25.96 + pasta.cost();
    }

    @Override
    public String getDescription() {
        return pasta.description + ", Сливочный соус";
    }
}
