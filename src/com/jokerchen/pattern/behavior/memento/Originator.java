package com.jokerchen.pattern.behavior.memento;

/**
 * @author joker
 * @Description:
 * @date 2018-10-08 22:30
 */
public class Originator {

    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }

}
