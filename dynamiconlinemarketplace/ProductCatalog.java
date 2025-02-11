package com.tit.javagenerics.dynamiconlinemarketplace;
import java.util.ArrayList;
import java.util.List;

public class ProductCatalog<T extends Product> {
    private List<T> products;

    public ProductCatalog() {
        products = new ArrayList<>();
    }

    public void addProduct(T product) {
        products.add(product);
    }

    public void displayCatalog() {
        for (T product : products) {
            product.displayDetails();
        }
    }

    // Generic method to apply discounts
    public <P extends Product> void applyDiscount(P product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
        System.out.println("Discount applied: " + percentage + "% for " + product.getName() + ". New Price: $" + product.getPrice());
    }
}
