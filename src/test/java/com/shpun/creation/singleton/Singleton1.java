package com.shpun.creation.singleton;

/**
 * @Description: 饿汉式
 * @Author: sun
 * @Date: 2021/1/5 15:02
 */
public class Singleton1 {

    private Singleton1() {}

    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }

}
