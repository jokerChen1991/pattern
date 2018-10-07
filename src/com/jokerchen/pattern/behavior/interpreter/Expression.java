package com.jokerchen.pattern.behavior.interpreter;

/**
 * 解释器模式，表达式接口
 * @author joker
 * @date 2018-10-07 12:04
 */
public interface Expression {

    boolean interpret(String context);

}
