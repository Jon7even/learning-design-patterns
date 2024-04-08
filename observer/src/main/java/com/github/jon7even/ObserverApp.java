package com.github.jon7even;

import com.github.jon7even.model.SpecificObserverOneImpl;
import com.github.jon7even.model.SpecificObserverSecondImpl;
import com.github.jon7even.model.StationObserverImpl;

public class ObserverApp {
    public static void main(String[] args) {
        StationObserverImpl stationOne = new StationObserverImpl();

        SpecificObserverOneImpl observerOne = new SpecificObserverOneImpl(stationOne);
        SpecificObserverSecondImpl observerSecond = new SpecificObserverSecondImpl(stationOne);

        System.out.println("-----------Станция получает новые данные и хочет поделиться -----------");
        stationOne.setData("Статус 1", 111);
        observerOne.onDisplay();
        observerSecond.onDisplay();

        System.out.println("-----------Станция получает новые данные и хочет поделиться -----------");
        stationOne.setData("Статус обновлен, теперь 2", 222);
        observerOne.onDisplay();
        observerSecond.onDisplay();
    }
}