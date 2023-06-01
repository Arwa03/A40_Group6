/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author shahad
 */
    
//
import java.util.ArrayList;

public class Product {
    // Instance variabless
    private String name;
    private int productID;
    private double price;
    private String size;
    private String flavor;

    // Constructor

    public Product(String name, int productID, double price, String size, String flavor) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.flavor = flavor;
        productID++;
    }
 

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

//
//    // Methods for adding, modifying, and deleting products
//    public static void addProduct(Product product) {
//        inventory.add(product);
//    }
//
//    public static void modifyProduct(int index, Product newProduct) {
//        inventory.set(index, newProduct);
//    }
//
//    public static void deleteProduct(int index) {
//        inventory.remove(index);
//    }
//
//    // Method for creating a note about the product
//    public void makeNote() {
//        // Code to create a note about the product
//        System.out.println("Creating a note about the product...");
//    }
////
//    // Main method for testing the Product class
//    public static void main(String[] args) {
//        // Create some sample colors for a product
//        ArrayList<String> colors = new ArrayList<String>();
//        colors.add("pink");
//        colors.add("blue");
//        colors.add("yellow");
//
//        // Create a new product and print its information
//        Product product1 = new Product("Birthday Cake", 29.99, "Cakes", colors);
//        System.out.println("Product name: " + product1.getName());
//        System.out.println("Price: $" + product1.getPrice());
//        System.out.println("Category: " + product1.getCategory());
//        System.out.println("Colors: " + product1.getColors().toString());
//
//        // Modify the product's information and print it again
//        product1.setPrice(39.99);
//        product1.setCategory("Specialty Cakes");
//        System.out.println("\nProduct name: " + product1.getName());
//        System.out.println("Price: $" + product1.getPrice());
//        System.out.println("Category: " + product1.getCategory());
//        System.out.println(":Colors: " + product1.getColors().toString());
//
//        // Add the product to the inventory and print the inventory
//        Product.addProduct(product1);
//        System.out.println("\nInventory:");
//        for (Product p : inventory) {
//            System.out.println(p.getName() + " - $" + p.getPrice() + " - " + p.getCategory());
//        }
//
//        // Modify the product in the inventory and print the updated inventory
//        Product.modifyProduct(0, new Product("Birthday Cake", 49.99, "Specialty Cakes", colors));
//        System.out.println("\nUpdated inventory:");
//        for (Product p : inventory) {
//            System.out.println(p.getName() + " - $" + p.getPrice() + " - " + p.getCategory());
//        }
//
//        // Delete the product from the inventory and print the updated inventory
//        Product.deleteProduct(0);
//        System.out.println("\nUpdated inventory:");
//        for (Product p : inventory) {
//            System.out.println(p.getName() + " - $" + p.getPrice() + " - " + p.getCategory());
//        }
//    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Product ID: "+productID+ "Product Name: " + name + "\tPrice: " + price + "\tSize: " + size + "\tflavor: " + flavor ;
    }
    
}
