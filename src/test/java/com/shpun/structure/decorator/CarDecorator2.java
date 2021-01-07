package com.shpun.structure.decorator;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 16:14
 */
public class CarDecorator2 extends CarDecorator {

    public CarDecorator2(Car car) {
        super(car);
    }

    @Override
    public String getCar() {
        return car.getCar() + " CarDecorator2 ";
    }
}
