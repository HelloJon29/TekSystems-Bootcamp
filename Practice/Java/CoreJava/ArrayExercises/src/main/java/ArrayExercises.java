import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
        System.out.println("PROGRAM 1:");
        programOne();

        System.out.println("PROGRAM 2:");
        programTwo();

        System.out.println("PROGRAM 3:");
        programThree();

        System.out.println("PROGRAM 4:");
        programFour();

        System.out.println("PROGRAM 5:");
        programFive();

        System.out.println("PROGRAM 6:");
        programSix();

        System.out.println("PROGRAM 7:");
        programSeven();

        System.out.println("PROGRAM 8:");
        programEight();

        System.out.println("PROGRAM 9:");
        programNine();

        System.out.println("PROGRAM 10:");
        programTen();
    }

    public static void programOne() {
        int[] myArray = {1,2,3};
        for(int i = 0; i <= myArray.length -1; i++) {
            System.out.println(myArray[i]);
        }
    }
    // Print the middle of an array
    public static void programTwo() {
        int[] myArray = {13,5,7,68,2};
        int midIndex = myArray.length / 2;

        System.out.println(myArray[midIndex]);
    }

    public static void programThree() {
        String[] myArray = {"red","green","blue","yellow"};
        System.out.println(myArray.length);

        String[] clone = myArray.clone();
        System.out.println(Arrays.toString(clone));
    }

    public static void programFour() {
        int[] myArray = {2,4,6,8,10};
        System.out.println(myArray[0]);
        //myArray[5] = 25; //this is also an OutOfBoundsError
        System.out.println(myArray[myArray.length -1]);

        //System.out.println(myArray[myArray.length]); // This is an OutOfBounds error

    }
    public static void programFive() {
        int[] myArray = new int[5];

        for(int i = 0; i <= myArray.length -1; i++) {
            myArray[i] = i;
        }
        System.out.println(Arrays.toString(myArray)); // Verify that it is saved to the values
    }
    public static void programSix() {
        int[] myArray = new int[5];

        for (int i = 0; i <= myArray.length - 1; i++) {
            myArray[i] = (i * 2);
        }
        System.out.println(Arrays.toString(myArray)); // Verify the elements
    }
    public static void programSeven() {
        int[] myArray = {2,4,6,8,10};
        int mid = (myArray.length - 1) / 2;

        for(int i = 0; i <= myArray.length -1; i++) {
            if(i != mid) {
                System.out.println(myArray[i]);
            }
        }

    }
    public static void programEight() {
        String[] numbers = {"one","two","three","four","five"};
        String temp = numbers[0];
        numbers[0] = numbers[2];
        numbers[2] = temp;

        System.out.println(Arrays.toString(numbers));
    }
    public static void programNine() {
        int[] numbers = {4,2,9,13,1,0};

        Arrays.sort(numbers); //Invoke static method sort from Arrays class

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length -1]);
    }
    public static void programTen() {
        Object[] myArray = {1,"red","green","blue",2.0}; // Creating the array as an object allows multiple data types
        System.out.println(Arrays.toString(myArray));
    }
}
