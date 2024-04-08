package com.github.jon7even.model;

public class SpecificObserverSecondImpl implements Observer, Display {
    private Subject stationData;
    private String state;
    private int data;

    public SpecificObserverSecondImpl(Subject stationData) {
        this.stationData = stationData;
        stationData.registerObserver(this);
    }

    @Override
    public void update(String state, int data) {
        this.state = state;
        this.data = data;
    }

    @Override
    public void onDisplay() {
        System.out.println("Привет! Мы наблюдатели 2 за Субьектом, текущий статус - " + state + " текущее значение - "
                + data);
    }
}
