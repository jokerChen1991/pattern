package com.jokerchen.pattern.behavior.interpreter;

/**
 * @author joker
 * @date 2018-10-07 12:07
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }


    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
