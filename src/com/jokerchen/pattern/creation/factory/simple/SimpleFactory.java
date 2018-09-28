package com.jokerchen.pattern.creation.factory.simple;

/**
 * @author joker
 * @date 2018-09-26 22:20
 */
public class SimpleFactory {

    public static Sender produce(String sender){
        if(sender != null){
            if(sender.equals("sms")){
                return new SmsSender();
            }else if(sender.equals("mail")){
                return new MailSender();
            }
        }
        return null;
    }
}
