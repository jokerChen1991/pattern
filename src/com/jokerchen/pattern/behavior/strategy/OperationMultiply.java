package com.jokerchen.pattern.behavior.strategy;

/**
 * @Description: 相乘策略
 * @author joker
 * @date 2018-10-08 22:55
 */
public class OperationMultiply implements Strategy{

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
