package com.github.jon7even.functional.headlights;

public class HeadlightsTypeLedImpl implements HeadlightsType {
    public void turnOnHeadlights() {
        System.out.println("Подготовка к включению Led Фар...");
        System.out.println("Питание на трансформатор пошло...");
        System.out.println("Светодиодные фары включены!");
    }

    public void turnOffHeadlights() {
        System.out.println("Светодиодные фары отключаются...");
        System.out.println("Питание выключено...");
        System.out.println("Светодиодные фары выключены!");
    }
}
