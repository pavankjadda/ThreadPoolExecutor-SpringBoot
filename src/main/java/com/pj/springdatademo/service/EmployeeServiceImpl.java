package com.pj.springdatademo.service;

import com.pj.springdatademo.model.Employee;
import com.pj.springdatademo.repo.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    private final EmployeeRepository employeeRepository;
    private final ThreadPoolExecutorUtil threadPoolExecutorUtil;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, ThreadPoolExecutorUtil threadPoolExecutorUtil)
    {
        this.employeeRepository = employeeRepository;
        this.threadPoolExecutorUtil = threadPoolExecutorUtil;
    }

    @Override
    public List<Employee> getAllEmployeesAsync()
    {
        for (int i=0;i<20000;i++)
        {
            TaskThread taskThread=new TaskThread(employeeRepository);
            threadPoolExecutorUtil.executeTask(taskThread);
        }
        /*
            Following code created to just return list of values at the end
         */
        TaskThread taskThread=new TaskThread(employeeRepository);
        threadPoolExecutorUtil.executeTask(taskThread);

        return taskThread.employees;
    }

    @Override
    public List<Employee> getAllEmployees()
    {
        return employeeRepository.findAll();
    }
}
