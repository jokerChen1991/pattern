package com.jokerchen.pattern.behavior.state;

/**
 * @Description:
 * @author joker
 * @date 2018-10-08 22:40
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
