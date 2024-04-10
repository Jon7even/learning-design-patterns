package com.github.jon7even.model.decorator.impl;

import com.github.jon7even.model.Pasta;
import com.github.jon7even.model.decorator.SauceDecorator;

public class TiriyakiSauce extends SauceDecorator {
    private final Pasta pasta;

    public TiriyakiSauce(Pasta pasta) {
        this.pasta = pasta;
    }

    @Override
    public double cost() {
        return 19.25 + pasta.cost();
    }

    @Override
    public String getDescription() {
        return pasta.description + ", Тирияки соус";
    }
}

