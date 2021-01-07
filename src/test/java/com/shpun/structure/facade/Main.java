package com.shpun.structure.facade;

/**
 * @Description:
 *
 * 门面模式，隐藏具体实现步骤，提供一个高层接口
 *
 * @Author: sun
 * @Date: 2021/1/5 16:19
 */
public class Main {

    public static void main(String[] args) {
        UserServiceFacade userServiceFacade = new UserServiceFacade();
        userServiceFacade.run();
    }

}
