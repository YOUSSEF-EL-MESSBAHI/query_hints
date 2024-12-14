package com.mesbahi.queryhints.service;

import com.mesbahi.queryhints.entity.Employee;
import com.mesbahi.queryhints.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Long fetchEmployees(){
        return repository.count();
    }

    public List<Employee> getEmployeesBySalary(double salary){
        return repository.findEmployeesWithSalaryGreaterThan(salary);
    }
}
