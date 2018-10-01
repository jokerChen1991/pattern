package com.jokerchen.pattern.structure.proxy.dynamic;

/**
 * @author joker
 * @date 2018-10-01 13:33
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        // 目标对象
        IDao target = new Dao();
        // 【原始的类型 class com.jokerchen.pattern.structure.proxy.dynamic.Dao】
        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        IDao proxy = (IDao) new ProxyFactory(target).getProxyInstance();
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.save();
    }
}
