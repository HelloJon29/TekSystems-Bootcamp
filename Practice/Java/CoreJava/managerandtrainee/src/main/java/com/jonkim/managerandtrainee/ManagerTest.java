package com.jonkim.managerandtrainee;

public class ManagerTest extends EmployeeTest{

    public ManagerTest(){ // default constructor
    }

    @Override
    public void calculateTransportAllowance() {
        double transportAllowance = 0.15 * basicSalary;
        System.out.println(transportAllowance);
    }
}
