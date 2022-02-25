package com.jonkim.managerandtrainee;

public class Trainee extends Employee{

    public Trainee(){ // default constructor
    }

    public Trainee(long id, String name, String address, long phone, double salary){
        super.employeeId = id;
        super.employeeName = name;
        super.employeeAddress = address;
        super.employeePhone = phone;
        super.basicSalary = salary;
    }
}
