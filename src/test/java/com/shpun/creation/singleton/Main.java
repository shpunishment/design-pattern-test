package com.shpun.creation.singleton;

/**
 * @Description:
 *
 * 单例模式，保证类全局仅有一个对象，使用时都使用同一个对象
 *
 * @Author: sun
 * @Date: 2021/1/5 15:08
 */
public class Main {

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();

        Singleton2 singleton2 = Singleton2.getInstance();

        Singleton3 singleton3 = Singleton3.getInstance();
    }

}
