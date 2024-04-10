package com.github.jon7even.model;

public abstract class Pasta {
    public String description = "Pasta";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
