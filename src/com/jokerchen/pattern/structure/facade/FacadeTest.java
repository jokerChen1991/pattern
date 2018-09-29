package com.jokerchen.pattern.structure.facade;

/**
 * @author joker
 * @date 2018-09-29 23:07
 */
public class FacadeTest {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}
