package com.shpun.creation.factory;

import com.shpun.creation.simplefactory.model.Food;

/**
 * @Description:
 *
 * 工厂模式，先选择工厂，再生产不同的对象
 *
 * @Author: sun
 * @Date: 2021/1/5 14:41
 */
public class Main {

    public static void main(String[] args) {
        FoodFactory chineseFoodFactory = new ChineseFoodFactory();
        Food chineseFoodA = chineseFoodFactory.getFood("A");

        FoodFactory americanFoodFactory = new AmericanFoodFactory();
        Food americanFoodB = americanFoodFactory.getFood("B");
    }

}
