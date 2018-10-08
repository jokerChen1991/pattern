package com.jokerchen.pattern.behavior.template;

/**
 * @author joker
 * @Description:
 * @date 2018-10-08 23:03
 */
public class TemplateTest {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

}
