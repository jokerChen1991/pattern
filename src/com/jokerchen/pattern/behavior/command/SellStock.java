package com.jokerchen.pattern.behavior.command;

/**
 * @author joker
 * @date 2018-10-04 21:10
 */
public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
