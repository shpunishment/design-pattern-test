package com.shpun.behavior.template;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 20:36
 */
public class Template1 extends Template {

    @Override
    protected void start() {
        System.out.println("template1  start");
    }

    @Override
    protected void play() {
        System.out.println("template1  play");
    }

    @Override
    protected void end() {
        System.out.println("template1  end");
    }
}
