package com.jonkim.managerandtrainee;

public class EmployeeTest {
    private long employeeId;
    private String employeeName;
    private String employeeAddress;
    private long employeePhone;
    protected double basicSalary;
    private double specalAllowance = 250.80;
    private double hra = 1000.50;

    public EmployeeTest(){ // Defualt Constructor
    }

    public EmployeeTest(long id, String name, String address, long phone, double salary) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeAddress = address;
        this.employeePhone = phone;
        this.basicSalary = salary;
    }

    public void calculateSalary() {

        double salary = basicSalary +
                (basicSalary * specalAllowance/100) +
                (basicSalary * hra/100);

        System.out.println(salary);
    }

    public void calculateTransportAllowance() {
        double transportAllowance = 0.10 * basicSalary;
        System.out.println(transportAllowance);
    }
}
