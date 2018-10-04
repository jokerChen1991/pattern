package com.jokerchen.pattern.behavior.command;

/**
 * @author joker
 * @date 2018-10-04 21:08
 */
public class BuyStock implements Order {

    private Stock stock;

    public BuyStock(Stock stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
