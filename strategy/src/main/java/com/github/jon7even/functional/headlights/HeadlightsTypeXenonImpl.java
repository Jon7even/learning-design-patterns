package com.github.jon7even.functional.headlights;

public class HeadlightsTypeXenonImpl implements HeadlightsType {
    public void turnOnHeadlights() {
        System.out.println("Подготовка к включению Ксеноновых Фар...");
        System.out.println("Подаю питания на блоки розжига...");
        System.out.println("Стабилизирую напряжение...");
        System.out.println("Ксеноновые фары включены!");
    }

    public void turnOffHeadlights() {
        System.out.println("Ксеноновые фары отключаются...");
        System.out.println("Снижаем напряжение на блоках розжига...");
        System.out.println("Питание выключено...");
        System.out.println("Ксеноновые фары выключены!");
    }
}
