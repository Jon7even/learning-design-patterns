package com.github.jon7even.model;

import com.github.jon7even.functional.headlights.HeadlightsTypeLedImpl;
import com.github.jon7even.functional.window.WindowLifterAutoImpl;

public class StandardCar extends Car {
    public StandardCar() {
        headlightsType = new HeadlightsTypeLedImpl();
        windowLifter = new WindowLifterAutoImpl();
    }

    public void promo() {
        System.out.println("Я самый стандартный автомобиль без выкрутасов");
    }
}

