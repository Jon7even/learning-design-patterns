package com.github.jon7even.model.decorator.impl;

import com.github.jon7even.model.decorator.SauceDecorator;

public class TiriyakiSauce extends SauceDecorator {
    @Override
    public double cost() {
        return 19.25;
    }

    @Override
    public String getDescription() {
        return "Тирияки соус";
    }
}

