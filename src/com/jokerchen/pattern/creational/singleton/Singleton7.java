package com.jokerchen.pattern.creational.singleton;

/**
 * 双重校验
 * @author joker
 * @date 2018-09-25 20:31
 */
public class Singleton7 {

    private volatile static Singleton7 singleton7;

    private Singleton7(){
        System.out.println("双重校验，时间："+System.currentTimeMillis());
    }

    public static Singleton7 getInstance(){
        if (singleton7 == null) {
            synchronized (Singleton7.class) {
                if (singleton7 == null) {
                    singleton7 = new Singleton7();
                }
            }
        }
        return singleton7;
    }

    public void doSomething(){
        System.out.println("双重校验");
    }
}
