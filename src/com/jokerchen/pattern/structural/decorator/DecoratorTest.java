package com.jokerchen.pattern.structural.decorator;

/**
 * @author joker
 * @date 2018-09-26 22:09
 */
public class DecoratorTest {

    public static void main(String[] args){
        Component component = new HopPotShop();

        component = new Beff(component);
        component = new Beff(component);
        component = new Beff(component);
        component = new Mutton(component);
        component = new Beff(component);
        component = new Lettuce(component);

        System.out.println(component.description()+component.price());
    }
}
