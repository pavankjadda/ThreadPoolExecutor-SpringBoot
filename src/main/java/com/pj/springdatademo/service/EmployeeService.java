package com.pj.springdatademo.service;

import com.pj.springdatademo.model.Employee;

import java.util.List;

public interface EmployeeService
{
    List<Employee> getAllEmployeesAsync();

    List<Employee> getAllEmployees();
}
