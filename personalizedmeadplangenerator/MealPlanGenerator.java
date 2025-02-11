package com.tit.javagenerics.personalizedmeadplangenerator;
public class MealPlanGenerator {
    public static void main(String[] args) {
        // Create meal plan categories
        Meal<VegetarianMeal> vegetarianMealPlan = new Meal<>();
        Meal<VeganMeal> veganMealPlan = new Meal<>();
        Meal<KetoMeal> ketoMealPlan = new Meal<>();

        // Add meals
        VegetarianMeal vegetarianMeal1 = new VegetarianMeal("Grilled Veggie Sandwich", 350);
        VeganMeal veganMeal1 = new VeganMeal("Quinoa Salad with Chickpeas", 400);
        KetoMeal ketoMeal1 = new KetoMeal("Bacon & Avocado Bowl", 500);

        vegetarianMealPlan.addMeal(vegetarianMeal1);
        veganMealPlan.addMeal(veganMeal1);
        ketoMealPlan.addMeal(ketoMeal1);

        // Generate personalized meal plans
        System.out.println("Personalized Meal Plans:");
        vegetarianMealPlan.generateMealPlan(vegetarianMeal1);
        veganMealPlan.generateMealPlan(veganMeal1);
        ketoMealPlan.generateMealPlan(ketoMeal1);
    }
}
