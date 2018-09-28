package com.jokerchen.pattern.creation.factory.simple;

/**
 * @author joker
 * @date 2018-09-26 22:23
 */
public class FactoryTest {

    public static void main(String[] args){
        Sender sender = SimpleFactory.produce("sms");
        sender.send();

        sender = MutipleMethodFactory.produceMail();
        sender.send();
    }
}
