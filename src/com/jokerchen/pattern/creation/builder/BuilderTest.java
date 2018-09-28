package com.jokerchen.pattern.creation.builder;

/**
 * @author joker
 * @date 2018-09-27 20:32
 */
public class BuilderTest {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareMeal1();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.cost());

        Meal nonVegMeal = mealBuilder.prepareMeal2();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.cost());
    }
}
