package com.jokerchen.pattern.creation.builder;

/**
 * @author joker
 * @date 2018-09-27 20:25
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 15.00F;
    }
}
