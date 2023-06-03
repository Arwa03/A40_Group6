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
        return "Product ID: "+ productID + "  Product Name: " + name + "  Price: " + price + "  Size: " + size + "  flavor: " + flavor ;
    }
    
}
