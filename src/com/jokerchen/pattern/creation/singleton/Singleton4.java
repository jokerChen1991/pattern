package com.jokerchen.pattern.creation.singleton;

/**
 * @author joker
 * @date 2018-09-25 20:20
 */
public class Singleton4 {

    private static Singleton4 instance;

    private Singleton4(){
        System.out.println("静态块："+System.currentTimeMillis());
    }

    static {
        instance = new Singleton4();
    }

    public static Singleton4 getInstance(){
        return instance;
    }

    public void doSomething(){
        System.out.println("静态块");
    }
}
