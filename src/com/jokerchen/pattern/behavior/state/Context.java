package com.jokerchen.pattern.behavior.state;

/**
 * @author joker
 * @Description:
 * @date 2018-10-08 22:40
 */
public class Context {

    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

}
