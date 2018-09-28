package com.jokerchen.pattern.creation.singleton;

/**
 * @author joker
 * @date 2018-09-25 20:17
 */
public class SingletonTest {

    public static void main(String[] args){
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton3 singleton3 = Singleton3.getInstance();
        Singleton4 singleton4 = Singleton4.getInstance();
        Singleton5 singleton5 = Singleton5.instance;
        Singleton6 singleton6 = Singleton6.getInstance();
        Singleton7 singleton7 = Singleton7.getInstance();


        Singleton1 singleton11 = Singleton1.getInstance();
        Singleton2 singleton21 = Singleton2.getInstance();
        Singleton3 singleton31 = Singleton3.getInstance();
        Singleton4 singleton41 = Singleton4.getInstance();
        Singleton5 singleton51 = Singleton5.instance;
        Singleton6 singleton61 = Singleton6.getInstance();
        Singleton7 singleton71 = Singleton7.getInstance();

        singleton1.doSomething();
        singleton2.doSomething();
        singleton3.doSomething();
        singleton4.doSomething();
        singleton5.doSomething();
        singleton6.doSomething();
        singleton7.doSomething();

        System.out.println(singleton1);
        System.out.println(singleton11);
        System.out.println(singleton2);
        System.out.println(singleton21);
        System.out.println(singleton3);
        System.out.println(singleton31);
        System.out.println(singleton4);
        System.out.println(singleton41);
        System.out.println(singleton5);
        System.out.println(singleton51);
        System.out.println(singleton6);
        System.out.println(singleton61);
        System.out.println(singleton7);
        System.out.println(singleton71);
    }

}
