package com.jokerchen.pattern.behavior.visitor;

/**
 * @Description: 访问者模式，访问者接口
 * @author joker
 * @date 2018-10-08 23:06
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
