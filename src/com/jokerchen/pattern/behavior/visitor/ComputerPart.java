package com.jokerchen.pattern.behavior.visitor;

/**
 * @Description: 访问则模式，元素接口
 * @author joker
 * @date 2018-10-08 23:04
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);

}
