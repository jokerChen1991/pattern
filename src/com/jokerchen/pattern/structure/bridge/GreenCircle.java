package com.jokerchen.pattern.structure.bridge;

/**
 * @author joker
 * @date 2018-09-27 21:18
 */
public class GreenCircle implements DrawCircle {
    
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing DrawCircle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
