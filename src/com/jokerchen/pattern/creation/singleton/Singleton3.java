package com.jokerchen.pattern.creation.singleton;

/**
 * @author joker
 * @date 2018-09-25 20:19
 */
public class Singleton3 {

    private static Singleton3 instance = new Singleton3();

    private Singleton3(){
        System.out.println("静态变量，时间："+System.currentTimeMillis());
    }

    public static Singleton3 getInstance(){
        return instance;
    }

    public void doSomething(){
        System.out.println("静态变量");
    }
}
