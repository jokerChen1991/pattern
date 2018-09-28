package com.jokerchen.pattern.creation.prototype;

/**
 * @author joker
 * @date 2018-09-27 20:45
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Draw Square");
    }
}
