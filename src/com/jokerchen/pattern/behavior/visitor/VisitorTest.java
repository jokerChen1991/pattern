package com.jokerchen.pattern.behavior.visitor;

/**
 * @author joker
 * @Description:
 * @date 2018-10-08 23:07
 */
public class VisitorTest {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

        ComputerPart mouse = new Mouse();
        mouse.accept(new ComputerPartDisplayVisitor());
    }

}
