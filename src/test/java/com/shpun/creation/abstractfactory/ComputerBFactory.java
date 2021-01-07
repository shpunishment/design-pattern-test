package com.shpun.creation.abstractfactory;

import com.shpun.creation.abstractfactory.model.Cpu;
import com.shpun.creation.abstractfactory.model.CpuB;
import com.shpun.creation.abstractfactory.model.MainBoard;
import com.shpun.creation.abstractfactory.model.MainBoardB;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 14:45
 */
public class ComputerBFactory extends ComputerFactory {

    @Override
    Cpu getCpu() {
        return new CpuB();
    }

    @Override
    MainBoard getMainBoard() {
        return new MainBoardB();
    }
}
