package com.github.jon7even.model.decorator.impl;

import com.github.jon7even.model.decorator.IngredientDecorator;

public class CheeseIngredient extends IngredientDecorator {
    @Override
    public double cost() {
        return 29.99;
    }

    @Override
    public String getDescription() {
        return "Сыр";
    }
}
