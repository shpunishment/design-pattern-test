package com.shpun.creation.abstractfactory;

import com.shpun.creation.abstractfactory.model.Computer;
import com.shpun.creation.abstractfactory.model.Cpu;
import com.shpun.creation.abstractfactory.model.MainBoard;

/**
 * @Description:
 *
 * 抽象工厂模式，生产的对象有产品族的区分，生产一系列的对象
 *
 * @Author: sun
 * @Date: 2021/1/5 14:49
 */
public class Main {

    public static void main(String[] args) {
        ComputerFactory computerAFactory = new ComputerAFactory();
        Cpu cpuA = computerAFactory.getCpu();
        MainBoard mainBoardA = computerAFactory.getMainBoard();
        Computer computer = new Computer(cpuA, mainBoardA);
    }

}
