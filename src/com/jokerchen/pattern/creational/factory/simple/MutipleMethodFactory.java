package com.jokerchen.pattern.creational.factory.simple;

/**
 * @author joker
 * @date 2018-09-26 22:24
 */
public class MutipleMethodFactory {

    public static Sender produceSms(){
        return new SmsSender();
    }

    public static Sender produceMail(){
        return new MailSender();
    }
}
