package com.jokerchen.pattern.structure.decorator;

/**
 * @author joker
 * @date 2018-09-26 21:56
 */
public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component){
        this.component = component;
    }

}
