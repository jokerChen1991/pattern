package com.jokerchen.pattern.creational.builder;

/**
 * @author joker
 * @date 2018-09-27 20:17
 */
public interface Item {

    String name();

    Packing packing();

    float price();
}
