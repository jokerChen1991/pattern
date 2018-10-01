package com.jokerchen.pattern.structure.proxy.staticProxy;

/**
 * @author joker
 * @date 2018-10-01 13:27
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        //目标对象
        Dao dao = new Dao();
        //代理对象,把目标对象传给代理对象,建立代理关系
        DaoProxy daoProxy = new DaoProxy(dao);
        //执行的是代理的方法
        daoProxy.save();
    }
}
