package com.shpun.behavior.command;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 17:43
 */
public class AddCommand implements Command {

    private UserServiceImpl userService;

    public AddCommand(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void execute() {
        this.userService.add();
    }
}
