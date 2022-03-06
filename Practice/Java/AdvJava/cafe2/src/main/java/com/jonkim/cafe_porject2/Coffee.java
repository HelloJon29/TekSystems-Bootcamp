package com.jonkim.cafe_porject2;

import java.util.Scanner;

public class Coffee extends Product{
    private boolean sugar;
    private boolean milk;

    public Coffee() {
        super();
        this.milk = false;
        this.sugar = false;
    }

    public Coffee(String name, double price, String description, boolean sugar, boolean milk) {
        super(name, price, description);
        this.sugar = sugar;
        this.milk = milk;
    }

    @Override
    public double calculateSubTotal() {
        double subTotal = this.getPrice() * this.getQuantity();

        return subTotal;
    }

    @Override
    public void getUserInput() {
        System.out.println("You chose Coffee");
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


    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }
}
