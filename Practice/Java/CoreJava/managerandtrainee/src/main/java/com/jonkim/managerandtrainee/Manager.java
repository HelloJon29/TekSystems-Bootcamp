package com.jonkim.managerandtrainee;

public class Manager extends Employee{

    public Manager(){ // default constructor
    }

    public Manager(long id, String name, String address, long phone, double salary){
        super.employeeId = id;
        super.employeeName = name;
        super.employeeAddress = address;
        super.employeePhone = phone;
        super.basicSalary = salary;
    }

    @Override
    public void calculateTransportAllowance() {
        double transportAllowance = 0.15 * basicSalary;
        System.out.println(transportAllowance);
    }
}
