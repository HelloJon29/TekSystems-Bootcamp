package com.jonkim.cafe3;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.Scanner;

public class ShoppingCart {

    // Instantiate objects to be added to cart
    Product coffee = new Coffee("Coffee", 2.50, "Ol' Reliable", false,false);
    Product cappuccino = new Cappuccino("Cappuccino",3.50,"Sweet",false,false);
    Product espresso = new Espresso("Espresso",3.75,"Energy boost",false,false);

    // Display checkout cart with each Product
    public void checkout() {
        System.out.printf("Item: %s", coffee.getName());
        System.out.printf(" Price: %.2f", coffee.getPrice());
        System.out.printf(" QTY: %d", coffee.getQuantity());
        System.out.printf(" Subtotal: %.2f\n", coffeeSubtotal());
        coffee.printOptions();

        System.out.printf("Item: %s", cappuccino.getName());
        System.out.printf(" Price: %.2f", cappuccino.getPrice());
        System.out.printf(" QTY: %d", cappuccino.getQuantity());
        System.out.printf(" Subtotal: %.2f\n", cappuccinoSubtotal());
        cappuccino.printOptions();

        System.out.printf("Item: %s", espresso.getName());
        System.out.printf(" Price: %.2f", espresso.getPrice());
        System.out.printf(" QTY: %d", espresso.getQuantity());
        System.out.printf(" Subtotal: %.2f\n", espressoSubtotal());
        espresso.printOptions();

    }

    // Display total tax
    public void printTax() {
        System.out.printf("Sales tax: %.2f\n", salesTax());
    }

    // Display grand total
    public void grandTotal() {
        System.out.printf("Grand total: %.2f", coffeeSubtotal() + cappuccinoSubtotal() + espressoSubtotal() + salesTax());
    }

    // Add products and calculate subtotals for each
    public void addCoffee() {
        Scanner add = new Scanner(System.in);
        System.out.println("Enter QTY:");
        coffee.setQuantity(add.nextInt());
    }
    public void coffeeOptions() {
        coffee.addOptions();
    }

    public double coffeeSubtotal() {
        return coffee.calculateSubTotal();
    }

    public void addCappuccino() {
        Scanner add = new Scanner(System.in);
        System.out.println("Enter QTY:");
        cappuccino.setQuantity(add.nextInt());
    }

    public void cappuccinoOptions() {
        cappuccino.addOptions();
    }

    public double cappuccinoSubtotal() {
        return cappuccino.calculateSubTotal();
    }

    public void addEspresso() {
        Scanner add = new Scanner(System.in);
        System.out.println("Enter QTY:");
        espresso.setQuantity(add.nextInt());
    }

    public void espressoOptions() {
        espresso.addOptions();
    }

    public double espressoSubtotal() {
        return espresso.calculateSubTotal();
    }



    // Calculate total salesTax
    public double salesTax() {
        return coffee.calculateSalesTax() + cappuccino.calculateSalesTax() + espresso.calculateSalesTax();
    }
}
