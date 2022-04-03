package com.example.my_first_fullstack_project.services;

import java.util.List;
import java.util.Optional;

import com.example.my_first_fullstack_project.models.Employee;
import com.example.my_first_fullstack_project.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary // this is incase there are more than 1 bean, to avoid ambiguity exception
public class EmployeeServiceImpl implements EmployeeService {
    // this is dependency injection from field, constructor is preferred instead,
    // this allows us to use everything from EmployeeRepository which extends JPARepository

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List <Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        Employee employee = employeeRepository.getById(id);
        if(employee == null) {
            throw new EmployeeNotFoundException();
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(long id) {
        this.employeeRepository.deleteById(id);
    }
}