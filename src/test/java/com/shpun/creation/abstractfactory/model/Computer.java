package com.shpun.creation.abstractfactory.model;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 14:46
 */
public class Computer {

    private Cpu cpu;

    private MainBoard mainBoard;

    public Computer(Cpu cpu, MainBoard mainBoard) {
        this.cpu = cpu;
        this.mainBoard = mainBoard;
    }

}
