package com.shpun.structure.bridge;

/**
 * @Description:
 *
 * 桥接模式，适用于两两组合的场景，防止子类爆炸
 *
 * @Author: sun
 * @Date: 2021/1/5 15:53
 */
public class Main {

    public static void main(String[] args) {
        Car carA1 = new CarA(new Engine1());
        carA1.drive();
        Car carA2 = new CarA(new Engine2());
        carA2.drive();
        Car carA3 = new CarA(new Engine3());
        carA3.drive();

        Car carB1 = new CarB(new Engine1());
        carB1.drive();
    }

}
