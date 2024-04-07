package com.github.jon7even.model;

import com.github.jon7even.functional.headlights.HeadlightsType;
import com.github.jon7even.functional.window.WindowLifter;

public abstract class Car {
    HeadlightsType headlightsType;
    WindowLifter windowLifter;

    public Car() {
    }

    public void headlightsOn() {
        headlightsType.turnOnHeadlights();
    }

    public void headlightOff() {
        headlightsType.turnOffHeadlights();
    }

    public void windowUp() {
        windowLifter.turnUpWindowLift();
    }

    public void windowDown() {
        windowLifter.turnDownWindowLift();
    }

    public abstract void promo();

    public void engineOn() {
        System.out.println("Двигатель запущен...");
    }

    public void engineOff() {
        System.out.println("Двигатель заглушен...");
    }
}
