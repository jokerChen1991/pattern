package com.jokerchen.pattern.behavior.command;

/**
 * 请求类
 * @author joker
 * @date 2018-10-04 21:06
 */
public class Stock {

    private String name = "name";

    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] bought");
    }

    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }

}
