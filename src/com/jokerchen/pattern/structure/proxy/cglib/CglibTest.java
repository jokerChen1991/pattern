package com.jokerchen.pattern.structure.proxy.cglib;

/**
 * @author joker
 * @date 2018-10-01 14:25
 */
public class CglibTest {

    public static void main(String[] args) {
        //目标对象
        Dao target = new Dao();

        //代理对象
        Dao proxy = (Dao)new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save();
    }
}
