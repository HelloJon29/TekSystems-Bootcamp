package com.jonkim.cafe3;

import java.util.Objects;

public abstract class Product {
    // Declare Private fields
    private String name;
    private double price;
    private double subTotal;
    private String description;
    private int quantity;
    final private double tax = 0.07;



    // defualt constructor
    public Product() {
    }
    // constructor that takes in args
    public Product(String name, double price, String description) {
        setName(name);
        setPrice(price);
        setDescription(description);
    }

    public double calculateSalesTax() {
        return getSubTotal() * getTax();
    }

    // methods to do calculations and return the subtotal value // now abstract
    public abstract double calculateSubTotal();

    // New abstract methods to add and print options
    public abstract void addOptions();

    public abstract void printOptions();


    // Getters and Setters for all fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTax() {
        return tax;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
}
