package com.jokerchen.pattern.creation.prototype;

/**
 * @author joker
 * @date 2018-09-27 20:45
 */
public class Circle extends Shape {

    public Circle(){
        type = "DrawCircle";
    }

    @Override
    void draw() {
        System.out.println("Draw DrawCircle");
    }
}
