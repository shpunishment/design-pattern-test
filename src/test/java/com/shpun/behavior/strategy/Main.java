package com.shpun.behavior.strategy;

/**
 * @Description:
 *
 * 策略模式，根据需求执行特定的实现子类
 *
 * @Date: 2021/1/5 20:44
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context(new Strategy1());
        context.execute();
    }

}
