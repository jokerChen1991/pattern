package com.jokerchen.pattern.creational.singleton;

/**
 * @author joker
 * @date 2018-09-25 20:16
 */
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2(){
        System.out.println("懒汉模式，线程安全，时间："+System.currentTimeMillis());
    }

    public synchronized static Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("懒汉模式，线程安全");
    }
}
