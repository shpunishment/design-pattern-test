package com.shpun.behavior.memento;

/**
 * @Description: 创建一个备忘录并设置其状态
 * @Author: sun
 * @Date: 2021/1/5 20:48
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento(){
        return new Memento(this.state);
    }

    public void getStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }


}
