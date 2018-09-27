package com.jokerchen.pattern.structural.bridge;

/**
 * @author joker
 * @date 2018-09-27 21:18
 */
public class RedCircle implements DrawCircle {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing DrawCircle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
