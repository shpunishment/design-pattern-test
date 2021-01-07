package com.shpun.creation.simplefactory;

import com.shpun.creation.simplefactory.model.Food;

/**
 * @Description:
 *
 * 简单工厂模式，只有一个工厂类，里面只有一个静态方法
 *
 * @Author: sun
 * @Date: 2021/1/5 14:58
 */
public class Main {

    public static void main(String[] args) {
        Food foodA = SimpleFactory.getFood("A");
        Food foodB = SimpleFactory.getFood("B");
    }

}
