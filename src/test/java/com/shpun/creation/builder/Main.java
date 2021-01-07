package com.shpun.creation.builder;

/**
 * @Description:
 *
 * 建造者模式，对于复杂类，通过创建建造类来简化创建过程，还可灵活组装
 *
 * @Author: sun
 * @Date: 2021/1/5 15:12
 */
public class Main {

    public static void main(String[] args) {
        User user = User.builder().id("1").name("张三").build();
    }

}
