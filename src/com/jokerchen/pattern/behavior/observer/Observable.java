package com.jokerchen.pattern.behavior.observer;

/**
 * 被观察者，即主题
 * @author joker
 * @date 2018-09-25 20:49
 */
public interface Observable {

    /**
     * 添加观察者
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    void deleteObserver(Observer observer);

    /**
     * 产生变化时，发起通知
     */
    void notifyObservers(String name, String message);

}
