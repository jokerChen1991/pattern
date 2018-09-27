package com.jokerchen.pattern.structural.bridge;

/**
 * @author joker
 * @date 2018-09-27 21:26
 */
public class BridgeTest {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
