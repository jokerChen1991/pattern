package com.jokerchen.pattern.behavioral.observer;

/**
 * @author joker
 * @date 2018-09-25 21:36
 */
public class Member implements Observer {

    private String name;

    public Member(String name){
        this.name = name;
    }

    @Override
    public void update(String name, String message) {
        System.out.println(this.name+" 收到 "+name+" 的消息："+message);
    }

    /**
     * 给哪个被观察者发消息
     * @param observable    被观察者
     * @param message
     */
    public void sendMessage(Observable observable,String message){
        observable.notifyObservers(this.name, message);
    }
}
