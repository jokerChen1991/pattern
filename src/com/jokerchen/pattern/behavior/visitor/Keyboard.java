package com.jokerchen.pattern.behavior.visitor;

/**
 * @Description:
 * @author joker
 * @date 2018-10-08 23:05
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
