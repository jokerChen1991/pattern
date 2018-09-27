package com.jokerchen.pattern.structural.decorator;

/**
 * @author joker
 * @date 2018-09-26 22:07
 */
public class Lettuce extends Decorator {

    public Lettuce(Component component){
        super(component);
    }

    @Override
    public String description() {
        return component.description()+"生菜-￥10.00\n";
    }

    @Override
    public double price() {
        return component.price()+10.00D;
    }
}
