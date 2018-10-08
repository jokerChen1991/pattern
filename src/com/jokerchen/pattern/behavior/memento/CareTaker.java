package com.jokerchen.pattern.behavior.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author joker
 * @date 2018-10-08 22:31
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }

}
