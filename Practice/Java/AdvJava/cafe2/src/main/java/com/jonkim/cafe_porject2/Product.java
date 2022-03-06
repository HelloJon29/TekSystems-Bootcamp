package com.jonkim.cafe_porject2;

import java.util.Objects;
import java.util.Scanner;

public abstract class Product {
    // Declare Private fields
    private String name;
    private double price;
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

    // methods to do calculations and return the subtotal value // now abstract
    public abstract double calculateSubTotal();

    public abstract void getUserInput();

    public abstract void displayUserInput();


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.getPrice(), getPrice()) == 0 && getQuantity() == product.getQuantity() && Double.compare(product.getTax(), getTax()) == 0 && getName().equals(product.getName()) && getDescription().equals(product.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getDescription(), getQuantity(), getTax());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", tax=" + tax +
                '}';
    }
}
