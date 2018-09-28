package com.jokerchen.pattern.creation.builder;

/**
 * @author joker
 * @date 2018-09-27 20:23
 */
public abstract class Drink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

}
