package com.jokerchen.pattern.creational.builder;

/**
 * @author joker
 * @date 2018-09-27 20:27
 */
public class Sprite extends Drink {

    @Override
    public String name() {
        return "Sprite";
    }

    @Override
    public float price() {
        return 6.00F;
    }
}
