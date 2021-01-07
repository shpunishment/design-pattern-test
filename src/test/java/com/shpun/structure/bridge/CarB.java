package com.shpun.structure.bridge;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 15:52
 */
public class CarB extends Car {

    public CarB(Engine engine) {
        super(engine);
    }

    @Override
    void drive() {
        System.out.println("CarB");
        this.engine.start();
    }
}
