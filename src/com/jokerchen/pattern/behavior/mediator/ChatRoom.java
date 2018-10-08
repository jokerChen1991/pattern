package com.jokerchen.pattern.behavior.mediator;

import java.util.Date;

/**
 * @Description:
 * @author joker
 * @date 2018-10-08 22:15
 */
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
