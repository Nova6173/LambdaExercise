package se.Lexicon.Lambda;

import java.util.List;


public class Product {
    private String name;
    private double price;
    private int stock;

    // Constructor
    public Product(String productName, double price, int stock) {
        this.name = productName;
        this.price = price;
        this.stock = stock;
    }

    // Getter for productName
    public String getName() {
        return name;
    }

    // Setter for productName
    public void setProductName(String productName) {
        this.name = productName;
    }

    // Getter för price
    public double getPrice() {
        return price;
    }

    // Setter för price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter för stock
    public int getStock() {
        return stock;
    }

    // Setter för stock
    public void setStock(int stock) {
        this.stock = stock;
    }

    // toString-metod för att skriva ut produktinformation
    @Override
    public String toString() {
        return "Product: " + name + ", Price: " + price + ", Stock: " + stock;
    }
}
