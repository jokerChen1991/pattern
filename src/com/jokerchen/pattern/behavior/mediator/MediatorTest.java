package com.jokerchen.pattern.behavior.mediator;

/**
 * @author joker
 * @Description:
 * @date 2018-10-08 22:16
 */
public class MediatorTest {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }

}
