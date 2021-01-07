package com.shpun.creation.abstractfactory;

import com.shpun.creation.abstractfactory.model.Cpu;
import com.shpun.creation.abstractfactory.model.CpuA;
import com.shpun.creation.abstractfactory.model.MainBoard;
import com.shpun.creation.abstractfactory.model.MainBoardA;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 14:45
 */
public class ComputerAFactory extends ComputerFactory {

    @Override
    Cpu getCpu() {
        return new CpuA();
    }

    @Override
    MainBoard getMainBoard() {
        return new MainBoardA();
    }
}
