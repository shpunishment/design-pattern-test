package com.shpun.behavior.command;

/**
 * @Description:
 * @Author: sun
 * @Date: 2021/1/5 17:44
 */
public class DeleteCommand implements Command {

    private UserServiceImpl userService;

    public DeleteCommand(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void execute() {
        this.userService.delete();
    }
}
