package com.shpun.creation.factory;

import com.shpun.creation.simplefactory.model.Food;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 14:52
 */
public interface FoodFactory {

    Food getFood(String name);

}
