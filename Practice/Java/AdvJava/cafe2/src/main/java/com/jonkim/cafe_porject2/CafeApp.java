package com.jonkim.cafe_porject2;



public class CafeApp {
    public static void main(String[] args) {
        // Instantiate Product objects
        Product espresso = new Espresso("Espresso", 3.00, "The extra kick", true,true);
        Product coffee = new Coffee("Coffee", 2.50, "Good ol reliable", true,true);
        Product cappuccino = new Cappuccino("Cappuccino", 4.00, "Sweet", true,true);


        espresso.getUserInput();
        espresso.displayUserInput();

        coffee.getUserInput();
        coffee.displayUserInput();

        cappuccino.getUserInput();
        cappuccino.displayUserInput();

//        System.out.printf("Subtotal: %.2f", coffee.calculateSubTotal());
//        System.out.printf(" Sales Tax: %.2f", coffee.calculateSalesTax());
//        System.out.printf(" Grand Total: %.2f", coffee.calculateGrandTotal());

    }
}
