package com.shpun.structure.adapter;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 15:29
 */
public class UserBServiceImpl implements UserBService {

    @Override
    public void setUserBId(String id) {
        System.out.println("userB id " + id);
    }

    @Override
    public void setUserBName(String name) {
        System.out.println("userB name " + name);
    }
}
