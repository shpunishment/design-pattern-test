package com.shpun.behavior.template;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 20:36
 */
public class Template2 extends Template {

    @Override
    protected void start() {
        System.out.println("template2  start");
    }

    @Override
    protected void play() {
        System.out.println("template2  play");
    }

    @Override
    protected void end() {
        System.out.println("template2  end");
    }
}
