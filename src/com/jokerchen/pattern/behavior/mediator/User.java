package com.jokerchen.pattern.behavior.mediator;

/**
 * @Description:
 * @author joker
 * @date 2018-10-08 22:15
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
