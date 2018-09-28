package com.jokerchen.pattern.creation.factory.method;


/**
 * @author joker
 * @date 2018-09-26 22:23
 */
public class FactoryTest {

    public static void main(String[] args){
        Factory factory = new MailFactory();
        Sender sender = factory.produce();
        sender.send();

        factory = new SmsFactory();
        sender = factory.produce();
        sender.send();
    }
}
