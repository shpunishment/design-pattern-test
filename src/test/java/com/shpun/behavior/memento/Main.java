package com.shpun.behavior.memento;

/**
 * @Description:
 *
 * 备忘录模式，保存后对象状态，并能够获取
 *
 * @Author: sun
 * @Date: 2021/1/5 20:57
 */
public class Main {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.setState("#1");
        originator.setState("#2");
        caretaker.save(originator.saveStateToMemento());

        originator.setState("#3");
        caretaker.save(originator.saveStateToMemento());

        originator.setState("#4");
        System.out.println("current: " + originator.getState());

        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("current: " + originator.getState());

        originator.getStateFromMemento(caretaker.get(1));
        System.out.println("current: " + originator.getState());

    }

}
