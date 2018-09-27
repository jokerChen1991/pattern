package com.jokerchen.pattern.creational.factory.method;

/**
 * @author joker
 * @date 2018-09-26 22:17
 */
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("sms sender...");
    }
}
