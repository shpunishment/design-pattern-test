package com.shpun.structure.adapter;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 15:29
 */
public class UserAServiceImpl implements UserAService {

    private String id;

    private String name;

    public UserAServiceImpl(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void setUserAId(String id) {
        System.out.println("userA id " + id);
    }

    @Override
    public void setUserAName(String name) {
        System.out.println("userA name " + name);
    }
}
