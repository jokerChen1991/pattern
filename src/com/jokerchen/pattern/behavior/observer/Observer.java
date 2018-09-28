package com.jokerchen.pattern.behavior.observer;

/**
 * 观察者
 * @author joker
 * @date 2018-09-25 20:56
 */
public interface Observer {

    /**
     * 观察者观察到变化以后触发的事情
     * @param message
     */
    void update(String name, String message);
}
