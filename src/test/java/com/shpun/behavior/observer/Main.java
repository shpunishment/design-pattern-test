package com.shpun.behavior.observer;

/**
 * @Description:
 *
 * 观察者模式，即发布和订阅，将发送方和接收方分离
 *
 * @Author: sun
 * @Date: 2021/1/5 20:26
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new Observer1(subject);
        Observer observer2 = new Observer2(subject);

        subject.update("data");

    }

}
