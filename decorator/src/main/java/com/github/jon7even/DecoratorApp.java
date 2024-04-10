package com.github.jon7even;

import com.github.jon7even.model.Pasta;
import com.github.jon7even.model.decorator.impl.CheeseIngredient;
import com.github.jon7even.model.decorator.impl.CreamySauce;
import com.github.jon7even.model.decorator.impl.MushroomsIngredient;
import com.github.jon7even.model.decorator.impl.TiriyakiSauce;
import com.github.jon7even.model.impl.Egg;
import com.github.jon7even.model.impl.Funchosa;
import com.github.jon7even.model.impl.Wheat;

public class DecoratorApp {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в наше кафе!\n");

        Pasta order1 = new Wheat();
        System.out.println("Ваш заказ: \n*"
                + order1.getDescription() + "*"
                + "\nИтого стоимость заказа - " + order1.cost() + " руб.\n\n");

        Pasta order2 = new Egg();
        System.out.println("Ваш заказ: \n*"
                + order2.getDescription() + "*"
                + "\nИтого стоимость заказа - " + order2.cost() + " руб.\n\n");

        Pasta order3 = new Funchosa();
        System.out.println("Ваш заказ: \n*"
                + order3.getDescription() + "*"
                + "\nИтого стоимость заказа - " + order3.cost() + " руб.\n\n");

        Pasta order4 = new Wheat();
        order4 = new TiriyakiSauce(order4);
        System.out.println("Ваш заказ: \n*"
                + order4.getDescription() + "*"
                + "\nИтого стоимость заказа - " + order4.cost() + " руб.\n\n");

        Pasta order5 = new Egg();
        order5 = new CreamySauce(order5);
        System.out.println("Ваш заказ: \n*"
                + order5.getDescription() + "*"
                + "\nИтого стоимость заказа - " + order5.cost() + " руб.\n\n");

        Pasta order6 = new Funchosa();
        order6 = new CheeseIngredient(order6);
        System.out.println("Ваш заказ: \n*"
                + order6.getDescription() + "*"
                + "\nИтого стоимость заказа - " + order6.cost() + " руб.\n\n");

        Pasta order7 = new Funchosa();
        order7 = new MushroomsIngredient(order7);
        System.out.println("Ваш заказ: \n*"
                + order7.getDescription() + "*"
                + "\nИтого стоимость заказа - " + order7.cost() + " руб.\n\n");

    }
}