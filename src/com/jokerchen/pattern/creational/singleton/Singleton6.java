package com.jokerchen.pattern.creational.singleton;

/**
 * @author joker
 * @date 2018-09-25 20:26
 */
public class Singleton6 {

    private Singleton6(){
        System.out.println("静态内部类，时间："+System.currentTimeMillis());
    }

    public static Singleton6 getInstance(){
        return InnerClass.instance;
    }

    public void doSomething(){
        System.out.println("静态内部类");
    }

    private static class InnerClass{
        private final static Singleton6 instance = new Singleton6();
    }
}
