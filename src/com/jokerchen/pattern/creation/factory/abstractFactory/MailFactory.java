package com.jokerchen.pattern.creation.factory.abstractFactory;

/**
 * @author joker
 * @date 2018-09-26 22:35
 */
public class MailFactory implements Factory {

    @Override
    public Sender sender() {
        return new MailSender();
    }

    @Override
    public Receiver receiver() {
        return new MailReceiver();
    }
}
