package com.jokerchen.pattern.behavior.nullObject;

/**
 * @Description: 空对象
 * @author joker
 * @date 2018-10-08 22:46
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
