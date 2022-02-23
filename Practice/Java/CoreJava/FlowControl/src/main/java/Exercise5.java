import java.util.Scanner;

// Write a if else if program for Grades, use scanner
public class Exercise5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a grade value between 0-100:");
        int score = userInput.nextInt();

        gradeLogic(score);
    }
    private static void gradeLogic(int grade) {
        if(grade < 0 || grade > 100) {
            System.out.println("Score out of range!");
        } else if(grade < 60) {
            System.out.println("F");
        } else if(grade >= 60 && grade <= 69) {
            System.out.println("D");
        } else if(grade >= 70 && grade <= 79) {
            System.out.println("C");
        } else if(grade >= 80 && grade <= 89) {
            System.out.println("B");
        } else if(grade >= 90 && grade <= 100) {
            System.out.println("A");
        }
    }

}
