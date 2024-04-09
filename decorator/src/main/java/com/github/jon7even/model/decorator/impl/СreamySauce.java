package com.github.jon7even.model.decorator.impl;

import com.github.jon7even.model.decorator.SauceDecorator;

public class СreamySauce extends SauceDecorator {
    @Override
    public double cost() {
        return 25.96;
    }

    @Override
    public String getDescription() {
        return "Сливочный соус";
    }
}
