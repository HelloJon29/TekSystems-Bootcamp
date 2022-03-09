package com.jonkim.concrete_parent_children;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>(
                Arrays.asList(
                        new Manager("sang"),
                        new Manager("Tony"),
                        new Trainee("mary")));
    }
}
