package com.shpun.structure.bridge;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 15:51
 */
public class CarA extends Car {

    public CarA(Engine engine) {
        super(engine);
    }

    @Override
    void drive() {
        System.out.println("CarA");
        this.engine.start();
    }
}
