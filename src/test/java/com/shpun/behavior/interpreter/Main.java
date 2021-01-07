package com.shpun.behavior.interpreter;

/**
 * @Description:
 *
 * 解释器模式，定义一种方式，来进行解释
 *
 * @Author: sun
 * @Date: 2021/1/5 17:47
 */
public class Main {

    public static void main(String[] args) {
        String str = "+18611112222";
        System.out.println(str.matches("\\+\\d+$"));
    }

}
