package com.jokerchen.pattern.creation.builder;

/**
 * @author joker
 * @date 2018-09-27 20:24
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Vegetable Burger";
    }

    @Override
    public float price() {
        return 10.00F;
    }
}
