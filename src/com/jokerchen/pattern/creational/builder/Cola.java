package com.jokerchen.pattern.creational.builder;

/**
 * @author joker
 * @date 2018-09-27 20:27
 */
public class Cola extends Drink {

    @Override
    public String name() {
        return "Coca Cola";
    }

    @Override
    public float price() {
        return 7.00F;
    }
}
