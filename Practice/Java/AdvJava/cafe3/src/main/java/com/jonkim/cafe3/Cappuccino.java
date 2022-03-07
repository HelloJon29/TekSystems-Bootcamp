package com.jonkim.cafe3;

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
        this.setSubTotal(getPrice()*getQuantity());
        if (this.peppermint == true) {
            this.setPrice(getPrice() + 2.00);
        }
        if (this.whippedCream == true) {
            this.setPrice(getPrice() + 1.00);
        }

        return this.getSubTotal();
    }

    @Override
    public void addOptions() {
        Scanner userChoice = new Scanner(System.in);
        boolean repeat = true;
        String yn;

        System.out.println("Please enter Y/N for extra options: ");
        while (repeat) {
            System.out.println("Peppermint? (Add $2.00)");
            yn = userChoice.nextLine().toLowerCase();
            switch (yn) {
                case "y":
                    setPeppermint(true);
                    repeat = false;
                    break;
                case "n":
                    repeat = false;
                    break;
                default:
                    System.out.println("Please enter only Y or N");
            }

            System.out.println("WhippedCream? (Add $1.00)");
            yn = userChoice.nextLine().toLowerCase();
            switch (yn) {
                case "y":
                    setWhippedCream(true);
                    repeat = false;
                    break;
                case "n":
                    repeat = false;
                    break;
                default:
                    System.out.println("Please enter only Y or N");
            }
        }
    }

    @Override
    public void printOptions() {
        if (isPeppermint() == true) {
            System.out.printf("%s\n", "Peppermint +$2.00: Yes");
        } else {
            System.out.printf("%s\n", "Peppermint: No"); // If Else for Sugar option display
        }

        if (isWhippedCream() == true) {
            System.out.printf("%s\n", "WhippedCream +$1.00: Yes");
        } else {
            System.out.printf("%s\n", "WhippedCream: No"); // If Else for Milk option display
        }
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
