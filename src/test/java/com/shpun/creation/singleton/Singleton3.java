package com.shpun.creation.singleton;

/**
 * @Description: 内部类
 * @Author: sun
 * @Date: 2021/1/5 15:05
 */
public class Singleton3 {

    private Singleton3(){}

    private static class Holder {
        private static Singleton3 instance = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return Holder.instance;
    }

}
