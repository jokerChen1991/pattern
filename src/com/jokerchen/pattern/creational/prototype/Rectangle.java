package com.jokerchen.pattern.creational.prototype;

/**
 * @author joker
 * @date 2018-09-27 20:45
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Draw rectangle");
    }
}
