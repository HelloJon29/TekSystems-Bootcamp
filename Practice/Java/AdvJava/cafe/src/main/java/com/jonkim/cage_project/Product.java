package com.jonkim.cage_project;

import java.util.Scanner;

public class Product {
    // Declare Private fields
    private String name;
    private double price;
    private String description;
    private int quantity;
    private double tax = 0.07;



    // defualt constructor
    public Product() {
    }
    // constructor that takes in args
    public Product(String name, double price, String description) {
        setName(name);
        setPrice(price);
        setDescription(description);
    }

    // method to do calculations and return the subtotal value
    public double calculateProductTotal() {
        double subTotal = this.price * this.quantity;

        return subTotal;
    }

    // method to get user input
    public void getUserInput() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please choose the amount of each product you'd like!");
        System.out.println("Quantity of " +
                getName() + ":");
        setQuantity(userInput.nextInt());
        System.out.println("That will be: \n" +
                getName() + "\n" +
                getDescription() + "\n" +
                calculateProductTotal());
    }


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

    public void setTax(double tax) {
        this.tax = tax;
    }
}
