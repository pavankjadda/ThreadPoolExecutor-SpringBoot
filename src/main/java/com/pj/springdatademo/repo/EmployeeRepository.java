package com.pj.springdatademo.repo;

import com.pj.springdatademo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee,Long>
{
}
