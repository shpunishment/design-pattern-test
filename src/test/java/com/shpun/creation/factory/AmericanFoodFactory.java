package com.shpun.creation.factory;

import com.shpun.creation.factory.model.AmericanFoodA;
import com.shpun.creation.factory.model.AmericanFoodB;
import com.shpun.creation.simplefactory.model.Food;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 14:41
 */
public class AmericanFoodFactory implements FoodFactory {

    @Override
    public Food getFood(String name) {
        if (name.equals("A")) {
            return new AmericanFoodA();
        } else if (name.equals("B")) {
            return new AmericanFoodB();
        }
        return null;
    }

}
