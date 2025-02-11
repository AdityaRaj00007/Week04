package com.tit.javagenerics.personalizedmeadplangenerator;
import java.util.ArrayList;
import java.util.List;

public class Meal<T extends MealPlan> {
    private List<T> mealPlans;

    public Meal() {
        this.mealPlans = new ArrayList<>();
    }

    public void addMeal(T meal) {
        mealPlans.add(meal);
    }

    public List<T> getMealPlans() {
        return mealPlans;
    }

    // Generic method to validate and display a personalized meal plan
    public <M extends MealPlan> void generateMealPlan(M meal) {
        if (meal.getCalories() > 0) {
            System.out.println("Generating Meal Plan:\n " + meal.getMealDetails() + " with " + meal.getCalories() + " calories.");
        } else {
            System.out.println("Invalid meal plan: Calories must be greater than zero.");
        }
    }
}
