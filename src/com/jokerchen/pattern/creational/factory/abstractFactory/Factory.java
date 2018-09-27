package com.jokerchen.pattern.creational.factory.abstractFactory;

/**
 * @author joker
 * @date 2018-09-26 22:28
 */
public interface Factory {

    Sender sender();

    Receiver receiver();
}
