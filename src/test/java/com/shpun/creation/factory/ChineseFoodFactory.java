package com.shpun.creation.factory;

import com.shpun.creation.factory.model.ChineseFoodA;
import com.shpun.creation.factory.model.ChineseFoodB;
import com.shpun.creation.simplefactory.model.Food;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 14:39
 */
public class ChineseFoodFactory implements FoodFactory {

    @Override
    public Food getFood(String name) {
        if (name.equals("A")) {
            return new ChineseFoodA();
        } else if (name.equals("B")) {
            return new ChineseFoodB();
        }
        return null;
    }

}
