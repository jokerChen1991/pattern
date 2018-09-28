package com.jokerchen.pattern.behavior.observer;

import java.util.Vector;

/**
 *
 * @author joker
 * @date 2018-09-25 21:16
 */
public class ChatRoom implements Observable {

    /**
     * 成员
     */
    private Vector<Observer> member;

    /**
     * 创造聊天室的时候，构建聊天室的成员，用于后续消息变化的时候，发送通知消息
     */
    public ChatRoom(){
        member = new Vector<>();
    }


    @Override
    public synchronized void addObserver(Observer observer) {
        if (member == null)
            throw new NullPointerException();
        if (!member.contains(observer)) {
            member.addElement(observer);
        }
    }

    @Override
    public synchronized void deleteObserver(Observer observer) {
        member.remove(observer);
    }

    @Override
    public void notifyObservers(String name, String message) {
        if(member != null && member.size()> 0){
            for(Observer observer : member){
                observer.update(name, message);
            }
        }
    }
}
