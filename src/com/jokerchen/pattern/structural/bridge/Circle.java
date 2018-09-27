package com.jokerchen.pattern.structural.bridge;

/**
 * @author joker
 * @date 2018-09-27 21:25
 */
public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawCircle drawCircle) {
        super(drawCircle);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawCircle.drawCircle(radius,x,y);
    }
}
