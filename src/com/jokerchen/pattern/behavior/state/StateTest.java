package com.jokerchen.pattern.behavior.state;

/**
 * @author joker
 * @Description:
 * @date 2018-10-08 22:41
 */
public class StateTest {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }

}
