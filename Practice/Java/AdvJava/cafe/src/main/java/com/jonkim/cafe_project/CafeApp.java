package com.jonkim.cafe_project;

public class CafeApp {
    public static void main(String[] args) {
        // Instantiate Product objects
        Product coffee = new Product("Coffee", 5.55, "Good ol reliable");
        Product expresso = new Product("Expresso", 6.25, "Extra energy");
        Product cappuccino = new Product("Cappuccino", 7.50,"Sweet and delicious");

        coffee.getUserInput();
//        expresso.getUserInput();
//        cappuccino.getUserInput();

        System.out.printf("Subtotal: %.2f", coffee.calculateProductTotal());
        System.out.printf(" Sales Tax: %.2f", coffee.calculateSalesTax());
        System.out.printf(" Grand Total: %.2f", coffee.calculateGrandTotal());
    }

}
