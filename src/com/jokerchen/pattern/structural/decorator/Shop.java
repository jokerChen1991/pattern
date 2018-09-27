package com.jokerchen.pattern.structural.decorator;

/**
 * @author joker
 * @date 2018-09-26 21:50
 */
public abstract class Shop implements Component {

    @Override
    public String description() {
        return shop();
    }

    public abstract String shop();

    @Override
    public double price() {
        return 0;
    }

}
