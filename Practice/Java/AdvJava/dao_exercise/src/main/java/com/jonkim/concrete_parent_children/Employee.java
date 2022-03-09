package com.jonkim.concrete_parent_children;

public abstract class Employee {
    private String employeeName;

    public Employee(String name) {
    }

    public String getEmployeeInfo() {
        return "Employee name is " + this.employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public abstract void calc();
}
