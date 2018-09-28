package com.jokerchen.pattern.structure.bridge;

/**
 * @author joker
 * @date 2018-09-27 21:20
 */
public abstract class Shape {

    protected DrawCircle drawCircle;

    protected Shape(DrawCircle drawCircle){
        this.drawCircle = drawCircle;
    }

    public abstract void draw();

}
