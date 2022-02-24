package com.jonkim.managerandtrainee;

public class Employee {
    private long employeeId;
    private String employeeName;
    private String employeeAddress;
    private long employeePhone;
    private double basicSalary;
    private double specalAllowance = 250.80;
    private double hra = 1000.50;

    public Employee(){ // Defualt Constructor
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long id) {
        this.employeeId = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String address) {
        this.employeeAddress = address;
    }

    public long getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(long phone) {
        this.employeePhone = phone;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double salary) {
        this.basicSalary = salary;
    }

/*    public double getSpecalAllowance() {
        return specalAllowance;
    }

    public void setSpecalAllowance(double specalAllowance) {
        this.specalAllowance = specalAllowance;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }*/

    public double calculateSalary() {

        double salary = basicSalary +
                (basicSalary * specalAllowance/100) +
                (basicSalary * hra/100);

        return salary;
    }
}
