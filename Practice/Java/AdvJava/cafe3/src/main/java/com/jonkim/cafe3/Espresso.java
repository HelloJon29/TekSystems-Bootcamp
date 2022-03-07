package com.jonkim.cafe3;

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
        this.setSubTotal(getPrice()*getQuantity());
        if (this.extraShot == true) {
            this.setPrice(getPrice() + 2.00);
        }
        if (this.macchiato == true) {
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
            System.out.println("Extra Shot?");
            yn = userChoice.nextLine().toLowerCase();
            switch (yn) {
                case "y":
                    setExtraShot(true);
                    repeat = false;
                    break;
                case "n":
                    repeat = false;
                    break;
                default:
                    System.out.println("Please enter only Y or N");
            }

            System.out.println("Macchiato?");
            yn = userChoice.nextLine().toLowerCase();
            switch (yn) {
                case "y":
                    setMacchiato(true);
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
        if (isExtraShot() == true) {
            System.out.printf("%s\n", "Extra Shot +$2.00: Yes");
        } else {
            System.out.printf("%s\n", "Extra Shot: No"); // If Else for Sugar option display
        }

        if (isMacchiato() == true) {
            System.out.printf("%s\n", "Macchiato +$1.00: Yes");
        } else {
            System.out.printf("%s\n", "Macchiato: No"); // If Else for Milk option display
        }
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
