package com.jonkim.cafe3;

import java.util.Locale;
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
        this.setSubTotal(getPrice()*getQuantity());
        return this.getSubTotal();
    }

    @Override
    public void addOptions() {
        Scanner userChoice = new Scanner(System.in);
        boolean repeat = true;
        String yn;

        System.out.println("Please enter Y/N for extra options: ");
        while (repeat) {
            System.out.println("Sugar?");
            yn = userChoice.nextLine().toLowerCase();
            switch (yn) {
                case "y":
                    setSugar(true);
                    repeat = false;
                    break;
                case "n":
                    repeat = false;
                    break;
                default:
                    System.out.println("Please enter only Y or N");
            }

            System.out.println("Milk?");
            yn = userChoice.nextLine().toLowerCase();
            switch (yn) {
                case "y":
                    setMilk(true);
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
        if (isSugar() == true) {
            System.out.printf("%s\n", "Sugar: Yes");
        } else {
            System.out.printf("%s\n", "Sugar: No"); // If Else for Sugar option display
        }

        if (isMilk() == true) {
            System.out.printf("%s\n", "Milk: Yes");
        } else {
            System.out.printf("%s\n", "Milk: No"); // If Else for Milk option display
        }
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
