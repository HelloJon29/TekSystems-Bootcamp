package com.perscholas.java_basics;

public class FinalProgram {
    public static void main(String[] args) {
        // The final program is cafe sales
        // initialize variables for 3 items on the menu
        Double sweetTea = 3.50 * 3; // simulate order by multiplying variables
        Double greenTea = 2.75 * 4;
        Double milkTea = 5.25 * 2;

        // initialize 3 more variables for subtotal and totalsale
        //Create a CONSTANT variable for SALES_TAX
        double subTotal = sweetTea + greenTea + milkTea;
        final double SALES_TAX = subTotal * 0.075;
        double totalSale = subTotal + SALES_TAX;
        System.out.printf("Your total is: %.2f",totalSale); // Use printf to format to 2 decimal places
    }
}
