package com.cg.service;

import java.util.List;

import com.cg.entity.Department;

public interface iDepartmentService {
	Department createDepartment(Department department);
    Department getDepartmentById(Long id);
    List<Department> getAllDepartments();
    Department updateDepartment(Long id, Department departmentDetails);
    void deleteDepartment(Long id);
}
