package com.tit.collections.shoppingcart;
import java.util.*;
public class ShoppingCart {
    private Map<String, Double> priceMap;         // Stores product prices (Product -> Price)
    private Map<String, Double> orderMap;         // Maintains order of items added
    private TreeMap<Double, List<String>> sortedMap; // Sorts items by price

    public ShoppingCart() {
        this.priceMap = new HashMap<>();
        this.orderMap = new LinkedHashMap<>();
        this.sortedMap = new TreeMap<>();
    }
    // Add a product to the cart
    public void addProduct(String product, double price) {
        priceMap.put(product, price);
        orderMap.put(product, price);
        // Update TreeMap for sorting by price
        sortedMap.computeIfAbsent(price, k -> new ArrayList<>()).add(product);
    }
    // Display items in the order they were added
    public void displayItemsInOrder() {
        System.out.println("\nItems in Cart:");
        for (Map.Entry<String, Double> entry : orderMap.entrySet()) {
            System.out.println(entry.getKey() + " -> $" + entry.getValue());
        }
    }
    // Display items sorted by price
    public void displayItemsByPrice() {
        System.out.println("\nItems Sorted by Price:");
        for (Map.Entry<Double, List<String>> entry : sortedMap.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + " -> $" + entry.getKey());
            }
        }
    }

    // Calculate total cart value
    public void displayTotalPrice() {
        double total = orderMap.values().stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("\nTotal Price: $" + total);
    }

    // Main method to test
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding products
        cart.addProduct("Laptop", 999.99);
        cart.addProduct("Headphones", 49.99);
        cart.addProduct("Mouse", 19.99);
        cart.addProduct("Keyboard", 79.99);

        // Display results
        cart.displayItemsInOrder();
        cart.displayItemsByPrice();
        cart.displayTotalPrice();
    }
}
