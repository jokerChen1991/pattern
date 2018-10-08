package com.jokerchen.pattern.behavior.nullObject;

/**
 * @Description: 创建实例的对象
 * @author joker
 * @date 2018-10-08 22:45
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
