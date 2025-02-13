package com.cg.service;

import java.util.List;
import java.util.Optional;

import com.cg.entity.Employee;

public interface iEmployeeService {
	Employee createEmployee(Employee employee);
    Optional<Employee> getEmployeeById(Long id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Long id, Employee employeeDetails);
    void deleteEmployee(Long id);
}
