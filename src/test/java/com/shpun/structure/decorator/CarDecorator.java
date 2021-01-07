package com.shpun.structure.decorator;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 16:11
 */
public abstract class CarDecorator implements Car {

    protected Car car;

    protected CarDecorator(Car car) {
        this.car = car;
    }

}
