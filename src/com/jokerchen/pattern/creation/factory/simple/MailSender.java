package com.jokerchen.pattern.creation.factory.simple;

/**
 * @author joker
 * @date 2018-09-26 22:19
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("mail sender...");
    }
}
