package com.jokerchen.pattern.behavior.chain;

/**
 * @author joker
 * @date 2018-10-04 20:31
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
