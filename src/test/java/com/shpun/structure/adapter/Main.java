package com.shpun.structure.adapter;

/**
 * @Description:
 *
 * 适配器模式，将两个不同的类通过创建适配器，让两个类实现转换，适配另一个类
 *
 * @Author: sun
 * @Date: 2021/1/5 15:31
 */
public class Main {

    public static void main(String[] args) {
        UserAServiceImpl userAService = new UserAServiceImpl("id A", "name A");

        UserBAdapter userBAdapter = new UserBAdapter(userAService);
        userBAdapter.setUserBId("id B adapter");
        userBAdapter.setUserBName("name B adapter");
    }

}
