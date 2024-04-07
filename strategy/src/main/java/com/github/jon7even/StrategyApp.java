package com.github.jon7even;

import com.github.jon7even.model.BasicCar;
import com.github.jon7even.model.PremiumCar;
import com.github.jon7even.model.StandardCar;

public class StrategyApp {
    public static void main(String[] args) {
        System.out.println("//////////////////////////////////////////////////");
        BasicCar basicCar = new BasicCar();
        basicCar.promo();
        basicCar.engineOn();
        basicCar.headlightsOn();
        basicCar.windowDown();
        basicCar.windowUp();
        basicCar.headlightOff();
        basicCar.engineOff();
        System.out.println("//////////////////////////////////////////////////");
        StandardCar standardCar = new StandardCar();
        standardCar.promo();
        standardCar.engineOn();
        standardCar.headlightsOn();
        standardCar.windowDown();
        standardCar.windowUp();
        standardCar.headlightOff();
        standardCar.engineOff();
        System.out.println("//////////////////////////////////////////////////");
        PremiumCar premiumCar = new PremiumCar();
        premiumCar.promo();
        premiumCar.engineOn();
        premiumCar.headlightsOn();
        premiumCar.windowDown();
        premiumCar.windowUp();
        premiumCar.headlightOff();
        premiumCar.engineOff();
        System.out.println("//////////////////////////////////////////////////");
    }
}