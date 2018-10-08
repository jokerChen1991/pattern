package com.jokerchen.pattern.behavior.state;

/**
 * @author joker
 * @Description:
 * @date 2018-10-08 22:39
 */
public class StartState implements State {


    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
