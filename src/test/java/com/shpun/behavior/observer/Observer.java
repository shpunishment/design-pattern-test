package com.shpun.behavior.observer;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 18:06
 */
public abstract class Observer {

    protected Subject subject;

    protected abstract void update();

}
