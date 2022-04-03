package com.example.my_first_fullstack_project.services;

import com.example.my_first_fullstack_project.models.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl2 implements EmployeeService{
    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public void saveEmployee(Employee employee) {

    }

    @Override
    public Employee getEmployeeById(long id) {
        return null;
    }

    @Override
    public void deleteEmployeeById(long id) {

    }
}
