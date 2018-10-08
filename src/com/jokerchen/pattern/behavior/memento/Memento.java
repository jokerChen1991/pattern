package com.jokerchen.pattern.behavior.memento;

/**
 * @Description: 备忘录模式，备忘录类
 * @author joker
 * @date 2018-10-08 22:26
 */
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

}
