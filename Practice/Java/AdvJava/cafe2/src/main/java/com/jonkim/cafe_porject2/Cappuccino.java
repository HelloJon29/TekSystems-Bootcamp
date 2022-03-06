package com.jonkim.cafe_porject2;

import java.util.Objects;
import java.util.Scanner;

public class Cappuccino extends Product{
    private boolean peppermint;
    private boolean whippedCream;

    public Cappuccino() {
        super();
        this.peppermint = false;
        this.whippedCream = false;
    }

    public Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream) {
        super(name, price, description);
        this.peppermint = peppermint;
        this.whippedCream = whippedCream;
    }

    @Override
    public double calculateSubTotal() {
        if (this.peppermint == true) {
            this.setPrice(getPrice() + 2.00);
        }
        if (this.whippedCream == true) {
            this.setPrice(getPrice() + 1.00);
        }

        return this.getPrice() * this.getQuantity();
    }

    @Override
    public void getUserInput() {
        System.out.println("You chose Cappuccino");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter QTY:");
        setQuantity(userInput.nextInt());
    }
    @Override
    public void displayUserInput() {
        System.out.println("Item: " + getName() +
                " Subtotal: " + calculateSubTotal() +
                " Desc: " + getDescription());
    }


    // Getters and Setters

    public boolean isPeppermint() {
        return peppermint;
    }

    public void setPeppermint(boolean peppermint) {
        this.peppermint = peppermint;
    }

    public boolean isWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }

}
