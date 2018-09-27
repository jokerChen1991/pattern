package com.jokerchen.pattern.creational.singleton;

/**
 * 懒汉模式，线程不安全
 * @author joker
 * @date 2018-09-25 20:13
 */
public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1(){
        System.out.println("懒汉模式，线程不安全，时间："+System.currentTimeMillis());
    }

    public static Singleton1 getInstance(){
        if(instance == null){
            instance = new Singleton1();
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("懒汉模式，线程不安全");
    }

}
