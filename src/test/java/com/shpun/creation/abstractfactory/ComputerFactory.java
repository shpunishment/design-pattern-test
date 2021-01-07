package com.shpun.creation.abstractfactory;

import com.shpun.creation.abstractfactory.model.Cpu;
import com.shpun.creation.abstractfactory.model.MainBoard;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 14:44
 */
public abstract class ComputerFactory {

    abstract Cpu getCpu();

    abstract MainBoard getMainBoard();

}
