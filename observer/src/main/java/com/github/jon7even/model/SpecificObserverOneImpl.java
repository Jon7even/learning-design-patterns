package com.github.jon7even.model;

public class SpecificObserverOneImpl implements Observer, Display {
    private Subject stationData;
    private String state;
    private int data;

    public SpecificObserverOneImpl(Subject stationData) {
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
        System.out.println("Привет! Мы наблюдатели 1 за Субьектом, текущий статус - " + state + " текущее значение - "
                + data);
    }
}
