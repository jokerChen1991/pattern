package com.jokerchen.pattern.creational.factory.method;

/**
 * @author joker
 * @date 2018-09-26 22:29
 */
public class SmsFactory implements Factory{

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}