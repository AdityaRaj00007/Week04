package com.tit.javagenerics.personalizedmeadplangenerator;
public class VeganMeal implements MealPlan {
    private String mealName;
    private int calories;

    public VeganMeal(String mealName, int calories) {
        this.mealName = mealName;
        this.calories = calories;
    }

    @Override
    public String getMealDetails() {
        return "Vegan Meal: " + mealName;
    }

    @Override
    public int getCalories() {
        return calories;
    }
}
