package com.tit.javagenerics.personalizedmeadplangenerator;
public class KetoMeal implements MealPlan {
    private String mealName;
    private int calories;

    public KetoMeal(String mealName, int calories) {
        this.mealName = mealName;
        this.calories = calories;
    }

    @Override
    public String getMealDetails() {
        return "Keto Meal: " + mealName;
    }

    @Override
    public int getCalories() {
        return calories;
    }
}
