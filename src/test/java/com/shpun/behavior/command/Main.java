package com.shpun.behavior.command;

/**
 * @Description:
 *
 * 命令模式，将方法封装成一个命令来执行
 *
 * @Author: sun
 * @Date: 2021/1/5 17:46
 */
public class Main {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        AddCommand addCommand = new AddCommand(userService);
        addCommand.execute();
        addCommand.execute();

        UpdateCommand updateCommand = new UpdateCommand(userService);
        updateCommand.execute();

        DeleteCommand deleteCommand = new DeleteCommand(userService);
        deleteCommand.execute();
    }

}
