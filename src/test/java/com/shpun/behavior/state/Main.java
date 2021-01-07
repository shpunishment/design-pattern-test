package com.shpun.behavior.state;

/**
 * @Description:
 *
 * 状态模式，描述状态的变化，以及每种状态下表现的行为
 *
 * @Author: sun
 * @Date: 2021/1/5 21:06
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState());

        EndState endState = new EndState();
        endState.doAction(context);

        System.out.println(context.getState());

    }

}
