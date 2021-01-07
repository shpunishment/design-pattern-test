package com.shpun.behavior.visitor;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 21:17
 */
public class ComputerVisitor {

    public void visitor(Mouse mouse) {
        System.out.println("mouse");
    }

    public void visitor(Keyboard keyboard) {
        System.out.println("keyboard");
    }

    public void visitor(Computer computer) {
        System.out.println("computer");
    }

}
