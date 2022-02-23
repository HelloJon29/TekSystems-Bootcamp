// Write a program to print the fibonacci series up to 50
public class Exercise8 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3; // will reassign this in the for loop to hold the sum of n1 and n2
        System.out.print(n1 + " " + n2);

        for (int i = 2; i < 10; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);

            n1 = n2; // These expressions move the sequence up
            n2 = n3;
        }
    }
}
