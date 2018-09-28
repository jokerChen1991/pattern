package com.jokerchen.pattern.creation.factory.abstractFactory;

/**
 * @author joker
 * @date 2018-09-26 22:35
 */
public class FactoryTest {

    public static void main(String[] args){
        Factory factory = new SmsFactory();
        Sender sender = factory.sender();
        Receiver receiver = factory.receiver();
        sender.send();
        receiver.receive();

        factory = new MailFactory();
        sender = factory.sender();
        receiver = factory.receiver();
        sender.send();
        receiver.receive();

    }
}
