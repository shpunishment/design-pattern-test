package com.shpun.structure.adapter;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 15:30
 */
public class UserBAdapter implements UserBService {

    private UserAService userAService;

    public UserBAdapter(UserAService userAService) {
        this.userAService = userAService;
    }

    @Override
    public void setUserBId(String id) {
        userAService.setUserAId(id);
    }

    @Override
    public void setUserBName(String name) {
        userAService.setUserAName(name);
    }
}
