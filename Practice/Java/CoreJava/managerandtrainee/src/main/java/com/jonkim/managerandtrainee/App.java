package com.jonkim.managerandtrainee;
// Main class App to run the program
public class App {
    public static void main(String[] args) {
        // Instantiate objects of Manager and Trainee and pass in inputs
        Manager m1 = new Manager(126534,"Peter","Chennai India",237844,65000);
        Trainee t1 = new Trainee(29846,"Jack","Mumbai India",442085,45000);

        //Print Manager and Trainee salarys and transport allowances using invoked methods
        System.out.println("Manager:");
        m1.calculateSalary();
        m1.calculateTransportAllowance();

        System.out.println("Trainee:");
        t1.calculateSalary();
        t1.calculateTransportAllowance();
    }
}
