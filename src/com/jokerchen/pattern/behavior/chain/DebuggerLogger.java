package com.jokerchen.pattern.behavior.chain;

/**
 * @author joker
 * @date 2018-10-04 20:35
 */
public class DebuggerLogger extends AbstractLogger {

    public DebuggerLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Debugger Console::Logger: " + message);
    }
}
