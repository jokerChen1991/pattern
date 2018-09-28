package com.jokerchen.pattern.structure.decorator;

/**
 * @author joker
 * @date 2018-09-26 22:05
 */
public class Mutton extends Decorator {

    public Mutton(Component component){
        super(component);
    }

    @Override
    public String description() {
        return component.description()+"羊肉-￥20.00\n";
    }

    @Override
    public double price() {
        return component.price()+20.00D;
    }
}
