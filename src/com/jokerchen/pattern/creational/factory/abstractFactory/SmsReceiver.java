package com.jokerchen.pattern.creational.factory.abstractFactory;

/**
 * @author joker
 * @date 2018-09-26 22:32
 */
public class SmsReceiver implements Receiver {

    @Override
    public void receive() {
        System.out.println("sms receiver...");
    }
}
