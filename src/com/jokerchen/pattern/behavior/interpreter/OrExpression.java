package com.jokerchen.pattern.behavior.interpreter;

/**
 * @author joker
 * @date 2018-10-07 12:16
 */
public class OrExpression implements Expression {

    private Expression expr1;
    private Expression expr2;


    public OrExpression(Expression expr1, Expression expr2){
        this.expr1 = expr1;
        this.expr2 = expr2;
    }


    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
