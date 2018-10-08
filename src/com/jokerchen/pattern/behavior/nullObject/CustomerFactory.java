package com.jokerchen.pattern.behavior.nullObject;

/**
 * @Description: 对象创建工厂类
 * @author joker
 * @date 2018-10-08 22:47
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }

}
