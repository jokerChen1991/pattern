package com.jokerchen.pattern.creational.singleton;

/**
 * @author joker
 * @date 2018-09-25 20:22
 */
public enum Singleton5 {
    instance;

    Singleton5(){
        System.out.println("枚举："+System.currentTimeMillis());
    }

    public void doSomething(){
        System.out.println("枚举");
    }


}
