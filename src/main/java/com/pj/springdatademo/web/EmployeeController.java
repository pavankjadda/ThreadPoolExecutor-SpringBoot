package com.pj.springdatademo.web;

import com.pj.springdatademo.model.Employee;
import com.pj.springdatademo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController
{
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/list")
    public List<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }

    @GetMapping(path = "/list/async")
    public List<Employee> getAllEmployeesAsync()
    {
        return employeeService.getAllEmployeesAsync();
    }
}
