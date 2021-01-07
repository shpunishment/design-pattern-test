package com.shpun.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 18:05
 */
public class Subject {

    private String data;

    private List<Observer> observerList;

    public Subject() {
        this.observerList = new ArrayList<>();
    }

    public void update(String data) {
        this.data = data;
        this.notifyObserverList();
    }

    public void attach(Observer observer) {
        this.observerList.add(observer);
    }

    private void notifyObserverList() {
        for(Observer observer : observerList) {
            observer.update();
        }
    }

}
