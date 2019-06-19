package com.pj.springdatademo.service;

import com.pj.springdatademo.model.Employee;
import com.pj.springdatademo.repo.EmployeeRepository;

import java.util.List;

public class TaskThread implements Runnable
{
    private final EmployeeRepository employeeRepository;
    List<Employee> employees;

    TaskThread(EmployeeRepository employeeRepository)
    {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run()
    {
        employees=employeeRepository.findAll();
    }
}
