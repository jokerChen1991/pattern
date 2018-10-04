package com.jokerchen.pattern.behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用类
 * @author joker
 * @date 2018-10-04 21:19
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        this.orderList.add(order);
    }

    public void placeOrders(){
        for(Order order : orderList){
            order.execute();
        }
        orderList.clear();
    }
}
