package com.jokerchen.pattern.structural.decorator;

/**
 * @author joker
 * @date 2018-09-26 22:02
 */
public class Beff extends Decorator {

    public Beff(Component component){
        super(component);
    }

    @Override
    public String description() {
        return component.description()+"牛肉-￥30.00\n";
    }

    @Override
    public double price() {
        return component.price()+30.00D;
    }
}
