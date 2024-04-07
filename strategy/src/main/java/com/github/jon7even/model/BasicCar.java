package com.github.jon7even.model;

import com.github.jon7even.functional.headlights.HeadlightsTypeLedImpl;
import com.github.jon7even.functional.window.WindowLifterManualImpl;

public class BasicCar extends Car {
    public BasicCar() {
        headlightsType = new HeadlightsTypeLedImpl();
        windowLifter = new WindowLifterManualImpl();
    }

    public void promo() {
        System.out.println("Я самый дешевый автомобиль в этом сегменте, на дачу поедем?");
    }
}

