package com.shpun.structure.bridge;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 15:50
 */
public abstract class Car {

    protected Engine engine;

    protected Car(Engine engine) {
        this.engine = engine;
    }

    abstract void drive();

}
