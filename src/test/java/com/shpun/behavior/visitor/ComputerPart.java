package com.shpun.behavior.visitor;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 21:17
 */
public interface ComputerPart {

    void accept(ComputerVisitor visitor);


}
