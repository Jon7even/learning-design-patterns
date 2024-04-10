package com.github.jon7even.model.decorator.impl;

import com.github.jon7even.model.Pasta;
import com.github.jon7even.model.decorator.IngredientDecorator;

public class MushroomsIngredient extends IngredientDecorator {
    private final Pasta pasta;

    public MushroomsIngredient(Pasta pasta) {
        this.pasta = pasta;
    }

    @Override
    public double cost() {
        return 45.98 + pasta.cost();
    }

    @Override
    public String getDescription() {
        return pasta.description + ", Грибы";
    }


}

