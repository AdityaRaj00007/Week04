package com.tit.javagenerics.dynamiconlinemarketplace;
public class DynamicMarketplace {
    public static void main(String[] args) {
        // Create product catalogs
        ProductCatalog<Book> bookCatalog = new ProductCatalog<>();
        ProductCatalog<Clothing> clothingCatalog = new ProductCatalog<>();
        ProductCatalog<Gadget> gadgetCatalog = new ProductCatalog<>();

        // Add products
        Book book1 = new Book("Java Programming", 50.00, "James Gosling");
        Clothing clothing1 = new Clothing("T-Shirt", 25.00, "M");
        Gadget gadget1 = new Gadget("Smartphone", 700.00, "OnePlus");

        bookCatalog.addProduct(book1);
        clothingCatalog.addProduct(clothing1);
        gadgetCatalog.addProduct(gadget1);

        // Display catalogs
        System.out.println("Product Catalogs:");
        bookCatalog.displayCatalog();
        clothingCatalog.displayCatalog();
        gadgetCatalog.displayCatalog();

        // Apply discount using a generic method
        System.out.println("\nApplying Discounts:");
        bookCatalog.applyDiscount(book1, 10);
        clothingCatalog.applyDiscount(clothing1, 20);
        gadgetCatalog.applyDiscount(gadget1, 15);

        // Display catalogs after applying discounts
        System.out.println("\nProduct Catalogs After Discounts:");
        bookCatalog.displayCatalog();
        clothingCatalog.displayCatalog();
        gadgetCatalog.displayCatalog();
    }
}
