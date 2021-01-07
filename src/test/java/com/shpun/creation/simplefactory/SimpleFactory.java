package com.shpun.creation.simplefactory;

import com.shpun.creation.simplefactory.model.Food;
import com.shpun.creation.simplefactory.model.FoodA;
import com.shpun.creation.simplefactory.model.FoodB;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 14:35
 */
public class SimpleFactory {

    public static Food getFood(String name) {
        if (name.equals("A")) {
            return new FoodA();
        } else if (name.equals("B")) {
            return new FoodB();
        }
        return null;
    }

}
