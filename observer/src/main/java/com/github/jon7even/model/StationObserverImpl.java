package com.github.jon7even.model;

import java.util.ArrayList;

public class StationObserverImpl implements Subject {
    private ArrayList<Observer> listObservers;
    private String state;
    private int data;

    public StationObserverImpl() {
        this.listObservers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        listObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        listObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer listObserver : listObservers) {
            ((Observer) listObserver).update(state, data);
        }
    }

    public void newData() {
        notifyObserver();
    }

    public void setData(String state, int data) {
        this.state = state;
        this.data = data;
        newData();
    }
}
