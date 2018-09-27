package com.jokerchen.pattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author joker
 * @date 2018-09-27 20:28
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float cost(){
        float cost = 0.00f;
        for(Item item : items){
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for(Item item: items){
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
