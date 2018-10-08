package com.jokerchen.pattern.behavior.strategy;

/**
 * @Description: 策略模式，使用策略
 * @author joker
 * @date 2018-10-08 22:56
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
