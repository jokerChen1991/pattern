package com.jokerchen.pattern.behavior.chain;

/**
 * @author joker
 * @date 2018-10-04 20:33
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
