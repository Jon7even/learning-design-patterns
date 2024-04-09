package com.github.jon7even.model.decorator.impl;

import com.github.jon7even.model.decorator.IngredientDecorator;

public class MushroomsIngredient extends IngredientDecorator {
    @Override
    public double cost() {
        return 45.98;
    }

    @Override
    public String getDescription() {
        return "Грибы";
    }
}

