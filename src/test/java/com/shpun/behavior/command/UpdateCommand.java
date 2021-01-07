package com.shpun.behavior.command;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 17:45
 */
public class UpdateCommand implements Command {

    private UserServiceImpl userService;

    public UpdateCommand(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void execute() {
        this.userService.update();
    }
}
