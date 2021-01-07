package com.shpun.structure.decorator;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 16:12
 */
public class CarDecorator1 extends CarDecorator {

    public CarDecorator1(Car car) {
        super(car);
    }

    @Override
    public String getCar() {
        return car.getCar() + " CarDecorator1 ";
    }
}
