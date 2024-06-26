package com.github.jon7even.model.decorator.impl;

import com.github.jon7even.model.Pasta;
import com.github.jon7even.model.decorator.IngredientDecorator;

public class CheeseIngredient extends IngredientDecorator {
    private final Pasta pasta;

    public CheeseIngredient(Pasta pasta) {
        this.pasta = pasta;
    }

    @Override
    public double cost() {
        return 29.99 + pasta.cost();
    }

    @Override
    public String getDescription() {
        return pasta.description + ", Сыр";
    }
}
