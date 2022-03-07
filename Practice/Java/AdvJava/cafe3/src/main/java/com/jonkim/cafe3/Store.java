package com.jonkim.cafe3;

import java.util.Scanner;

public class Store {

    public void menu() {
        Scanner myScan = new Scanner(System.in);
        ShoppingCart myCart = new ShoppingCart();

        int menuSelection = 0;
        boolean repeatMenu = true;

        while(repeatMenu) {
            menuDisplay();
            menuSelection = myScan.nextInt();
            switch (menuSelection) {
                case 1:
                    myCart.addCoffee();
                    myCart.coffeeOptions();
                    System.out.println("Added Coffee");
                    break;
                case 2:
                    myCart.addCappuccino();
                    myCart.cappuccinoOptions();
                    System.out.println("Added Cappuccino");
                    break;
                case 3:
                    myCart.addEspresso();
                    myCart.espressoOptions();
                    System.out.println("Added Espresso");
                    break;
                case 4:
                    System.out.println("Checkout: ");
                    myCart.checkout();
                    myCart.salesTax();
                    myCart.printTax();
                    myCart.grandTotal();
                    repeatMenu = false;
                    break;
                case 5:
                    System.out.println("Exit");
                    repeatMenu = false;
                    break;
                default:
                    System.out.println("Unknown selection, try again");
            }

        }
        myScan.close();
    }

    // PlaceHolder menu view to console
    public void menuDisplay() {
        System.out.println("Please select from the following menu:");

        System.out.println("1. Coffee:");
        System.out.println("2. Cappuccino:");
        System.out.println("3. Espresso:");
        System.out.println("4. Checkout:");
        System.out.println("5. Exit:");
    }
}
