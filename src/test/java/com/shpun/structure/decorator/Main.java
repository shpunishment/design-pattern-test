package com.shpun.structure.decorator;

/**
 * @Description:
 *
 * 装饰器模式，动态的添加附加功能
 *
 * @Author: sun
 * @Date: 2021/1/5 16:15
 */
public class Main {

    public static void main(String[] args) {
        Car car1 = new CarDecorator1(new CarA());
        System.out.println(car1.getCar());

        Car car2 = new CarDecorator2(new CarDecorator1(new CarB()));
        System.out.println(car2.getCar());
    }

}
