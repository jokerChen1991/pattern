package com.jokerchen.pattern.creation.factory.abstractFactory;

/**
 * @author joker
 * @date 2018-09-26 22:34
 */
public class SmsFactory implements Factory {

    @Override
    public Sender sender() {
        return new SmsSender();
    }

    @Override
    public Receiver receiver() {
        return new SmsReceiver();
    }
}
