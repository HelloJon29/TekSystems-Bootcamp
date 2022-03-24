package jpa.mainrunner;

import jpa.dao.CourseDAO;
import jpa.dao.StudentDAO;
import jpa.service.CourseService;
import jpa.service.StudentService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SMSRunner {
    // instantiate service classes and a Scanner for user input
    private static StudentDAO studentService = new StudentService();
    private static CourseDAO courseService = new CourseService();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        while(true) {
            mainMenu();
            try {
                choice = input.nextInt();

                // this if statement stops input greater than 2 and less than 1
                if(choice > 2 || choice < 1) {
                    System.out.println("Please enter only 1 or 2");
                }
            } catch(InputMismatchException e) {
                // This stops illegal characters from being inputted
                System.out.println("Please enter only 1 or 2");
                input.nextLine();
                continue;
            }
            input.nextLine();
            switch(choice) {
                case 1:
                    fetchStudent();
                    break;
                case 2:
                    // close scanner here to prevent memory leak, this is the end of the app
                    input.close();
                    quitMessage();
                    return;
            }
        }
    }

    // static method to print main menu to console
    public static void mainMenu() {
        System.out.println("Are you a(n)\n" +
                "1. Student\n" +
                "2. quit");
        System.out.println("Please enter 1 or 2");
    }

    // static method to quit application with message to console
    public static void quitMessage() {
        System.out.println("Application quit");
    }

    // static method to print register course menu to console
    public static void registerCourseMenu(){
        System.out.println("\n1. Register to Class\n" +
                "2. Logout");
    }

    public static void fetchStudent() {
        boolean flag = false;
        // take user input for email
        System.out.println("Enter Email:");
        String email = input.nextLine().toLowerCase(); // toLowerCase to avoid case mismatch

        // take user input for password, this will be case sensitive
        System.out.println("Enter Student Password");
        String password = input.nextLine();
        flag = studentService.validateStudent(email, password);

        if(flag) {
            while(true) {
                System.out.printf("My classes:\n%-10s %-40s %-20s", "#", "Course Name", "Instructor Name");
                studentService.getStudentCourses(email).forEach(courses -> System.out.printf("%10d %40s %20s\n",
                        courses.getcId(),
                        courses.getcName(),
                        courses.getcInstructorName()));
                boolean logout = registerStudent(email);

                if(logout == false) {
                    System.out.println("You have been signed out");
                    break;
                } else {
                    continue;
                }
            }
        } else {
            System.out.println("Wrong Credentials");
        }

    }

    public static boolean registerStudent(String email) {
        int choice = 0;
        while(true) {
            registerCourseMenu();
            // try catch with if statement to catch InputMismatch error
            try {
                choice = input.nextInt();
                input.nextLine();

                // catch
                if(choice == 1 || choice == 2) {
                    break;
                } else {
                    System.out.println("Please enter 1 or 2");
                }
            } catch(InputMismatchException e) {
                input.nextLine();
                System.out.println("Please enter only 1 or 2");
            }
        }

        switch(choice) {
            case 1:
                System.out.printf("All Courses:\n%-10s %-40s %-20s\n", "ID", "Course Name", "Instructor Name");
                courseService.getAllCourses().forEach(courses -> System.out.printf("%-10d %-40s %-20s\n",
                        courses.getcId(),
                        courses.getcName(),
                        courses.getcInstructorName()));
                System.out.println("Select a Course:");
                int courseOption;

                while(true) {
                    try {
                        courseOption = input.nextInt();
                        input.nextLine();

                        if(courseOption > 0 && courseOption < 11) {
                            break;
                        } else {
                            System.out.println("Please enter 1 - 10 only");
                        }
                    } catch(InputMismatchException e) {
                        input.nextLine();
                        System.out.println("Please only enter a valid number 1 - 10");
                    }
                }
                studentService.registerStudentToCourse(email,courseOption);
                return true;
            default:
                return false;
        }
    }
}
