package com.example;

import java.util.Map;

public class CartSystem extends TheSystem {
    CartSystem() {
    }

    @Override
    public void display() {
        super.getItemCollection();
        double subTotal = 0.0;
        double tax = 0.0;
        double total = 0.0;

        // Created display for the table and columns
        String tableHeader = String.format("Cart:\n%-20s %-20s %-10s %-10s %-10s",
                "Name",
                "Description",
                "Price",
                "Quantity",
                "Sub Total");
        System.out.println(tableHeader);

        // this for loop iterates over each entry and displays the value of the elements
        for (Map.Entry<String, Item> element : super.getItemCollection().entrySet()) {
            Item value = element.getValue();
            double itemTotal;
            itemTotal = (value.getItemPrice()* value.getQuantity());
            subTotal += itemTotal;
            String tableValues = String.format("%-20s %-20s %-10.2f %-10d %-10.2f",
                    value.getItemName(),
                    value.getItemDesc(),
                    value.getItemPrice(),
                    value.getQuantity(),
                    subTotal);
            System.out.println(tableValues);
        }
        // this is printed after for loop for list of subtotal, tax, and final total
        tax = (subTotal * 0.05);
        total = (subTotal + tax);
        String printTotals = String.format("%-20s %-20.2f%n%-20s %-20.2f%n%-20s %-20.2f",
                "Pre-tax Total ",subTotal,
                "Tax ",tax,
                "Total ",total);
        System.out.println(printTotals);
    }
}
