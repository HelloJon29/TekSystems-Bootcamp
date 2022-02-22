import java.util.Scanner;

public class HexToDec {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Instantiate Scanner object for user input

        System.out.println("Enter a single hexidecimal digit:");
        String hex = input.nextLine(); // Store the hexadecimal input from the user as a String

        int decimalValue = Integer.parseInt(hex,16); //Parse it into an int value and store in a int variable, use radix 16 for hexidecimal to decimal

        System.out.println("The decimal format is: " + decimalValue); // print the hex digit value to decimal
    }
}
