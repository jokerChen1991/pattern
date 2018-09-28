package com.jokerchen.pattern.creation.builder;

/**
 * @author joker
 * @date 2018-09-27 20:31
 */
public class MealBuilder {

    public Meal prepareMeal1 (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Cola());
        return meal;
    }

    public Meal prepareMeal2 (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Sprite());
        return meal;
    }

}
