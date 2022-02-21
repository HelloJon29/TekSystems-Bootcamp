package com.perscholas.java_basics;

public class BasicsClass {
    public static void main(String[] args) {
        // 1st program
        // Declare variables and calulate sum
        int x = 5;
        int y = 7;
        int sum = x + y;
        // print to console the sum variable
        System.out.println(sum);

        // 2nd program
        // Declare double variables and calculate sum variable then print
        double a = 2.0;
        double b = 8.6;
        double sum2 = a + b;
        System.out.println(sum2);

        // 3rd program
        // Use previous assigned variables and print out sum of double and int variables,
        // the type will always be double through promotion of int type
        double sum3 = x + b;
        System.out.println(sum3);

        // 4th program
        // Initialize 2 int variables and divide them, print outcome
        // If you change a number to a decimal it creates an error
        // you must change type to double or float for at least 1 variable and the variable used for calc
        // or you can cast it to a double variable
        int c = 3;
        int d = 15;
        double d2 = d; // casted int d to a double variable, it auto casts it through promotion
        double quotient = d2 / c;
        System.out.println(quotient);

        // 5th program
        // intitalize 2 double variables, divide them, print out result
        double e = 5.6;
        double f = 30.2;
        double quotient2 = f / e;
        System.out.println(quotient2);

        // Now cast the result to a int type and print
        int quotientInt = (int) quotient2;
        System.out.println(quotientInt);

        // 6th program
        //initialize 2 int variables, the result variable i, and print
        int g = 5;
        int h = 6;
        int i = h / g;
        System.out.println(i);

        //cast h to a double type and print again (h being y from the question) this breaks the code because i is not the correct type.
//        double h2 = h;
//        i = h2 / g;
//        System.out.println(i);

        // 7th program
        // initialize a CONSTANT variable with final
        // also intialize arms and total variables then print total
        final int NUMBER_OF_PEOPLE = 10000;
        int arms = 2;
        int total = NUMBER_OF_PEOPLE * arms;
        System.out.println(total);
    }
}
