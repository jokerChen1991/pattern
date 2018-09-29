package com.jokerchen.pattern.structure.facade;

/**
 * @author joker
 * @date 2018-09-29 23:05
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }

}
