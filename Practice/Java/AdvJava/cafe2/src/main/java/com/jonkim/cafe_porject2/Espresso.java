package com.jonkim.cafe_porject2;

import java.util.Scanner;

public class Espresso extends Product{
    private boolean extraShot;
    private boolean macchiato;

    public Espresso() {
        super();
        this.extraShot = false;
        this.macchiato = false;
    }

    public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
        super(name, price, description);
        this.extraShot = extraShot;
        this.macchiato = macchiato;
    }

    @Override
    public double calculateSubTotal() {
        if (this.extraShot == true) {
            this.setPrice(getPrice() + 2.00);
        }
        if (this.macchiato == true) {
            this.setPrice(getPrice() + 1.00);
        }

        return this.getPrice() * this.getQuantity();
    }

    @Override
    public void getUserInput() {
        System.out.println("You chose Espresso");
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


    //Getters and Setters
    public boolean isExtraShot() {
        return extraShot;
    }

    public void setExtraShot(boolean extraShot) {
        this.extraShot = extraShot;
    }

    public boolean isMacchiato() {
        return macchiato;
    }

    public void setMacchiato(boolean macchiato) {
        this.macchiato = macchiato;
    }
}
