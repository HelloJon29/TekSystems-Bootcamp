import java.util.Scanner;

public class InputToSingles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Initiate scanner for user input
        System.out.println("Please enter an amount of change: ");
        double change = input.nextDouble(); // variable to store the input from the user

        int amount = (int)(change * 100); //Begin calculations for collecting remainders by removing decimal place and casting the double to integer

        int dollars = amount / 100; // Take dollar amount only
        amount = amount % 100; // reassign amount value to the remainder after taking dollars and repeat for other values

        int quarters = amount / 25;
        amount = amount % 25;

        int dimes = amount / 10;
        amount = amount % 10;

        int nickels = amount / 5;
        amount = amount % 5;

        int pennies = amount; // the final amount is left over pennies

        // Print statement for each value
        System.out.println(dollars + " Dollars\n"
                + quarters + " Quarters\n"
                + dimes + " Dimes\n"
                + nickels + " Nickels\n"
                + pennies + " Pennies\n");
    }
}
