package com.tit.javagenerics.personalizedmeadplangenerator;
public class VegetarianMeal implements MealPlan {
    private String mealName;
    private int calories;

    public VegetarianMeal(String mealName, int calories) {
        this.mealName = mealName;
        this.calories = calories;
    }

    @Override
    public String getMealDetails() {
        return "Vegetarian Meal: " + mealName;
    }

    @Override
    public int getCalories() {
        return calories;
    }
}
