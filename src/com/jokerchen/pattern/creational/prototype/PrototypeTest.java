package com.jokerchen.pattern.creational.prototype;

/**
 * @author joker
 * @date 2018-09-27 20:49
 */
public class PrototypeTest {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());
        System.out.println(clonedShape);

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
        System.out.println(clonedShape2);

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
        System.out.println(clonedShape3);
    }
}
