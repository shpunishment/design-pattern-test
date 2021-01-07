package com.shpun.behavior.observer;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 18:06
 */
public class Observer1 extends Observer {

    public Observer1(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("observer1");
    }
}
