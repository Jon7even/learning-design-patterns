package com.github.jon7even.model;

import com.github.jon7even.functional.headlights.HeadlightsTypeXenonImpl;
import com.github.jon7even.functional.window.WindowLifterAutoImpl;

public class PremiumCar extends Car {
    public PremiumCar() {
        headlightsType = new HeadlightsTypeXenonImpl();
        windowLifter = new WindowLifterAutoImpl();
    }

    public void promo() {
        System.out.println("Я самый дорогой автомобиль в этом сегменте");
    }
}
