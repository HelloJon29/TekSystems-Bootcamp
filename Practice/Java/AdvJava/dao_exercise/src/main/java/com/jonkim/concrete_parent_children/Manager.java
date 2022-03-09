package com.jonkim.concrete_parent_children;

public class Manager extends Employee{
    private String department;

    public Manager(String name) {
        super(name);
    }

    @Override
    public void calc() {

    }

    public String getManagerInfo(){
        return department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
