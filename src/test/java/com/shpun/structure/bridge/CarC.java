package com.shpun.structure.bridge;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 15:53
 */
public class CarC extends Car {

    public CarC(Engine engine) {
        super(engine);
    }

    @Override
    void drive() {
        System.out.println("CarC");
        this.engine.start();
    }
}
