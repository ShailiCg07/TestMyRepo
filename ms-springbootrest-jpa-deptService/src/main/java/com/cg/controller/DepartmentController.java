package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Department;
import com.cg.feign.DepartmentFeignClient;
import com.cg.service.DepartmentService;


@RestController
@RequestMapping("/dapi/departments")
public class DepartmentController {
	@Autowired
    private DepartmentService departmentService;
	
	@Autowired
	DepartmentFeignClient departmentFeignClient;

    @PostMapping
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.createDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable Long id) {
        return departmentService.getDepartmentById(id);
    }

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @PutMapping("/{id}")
    public void updateDepartment(@PathVariable Long id, @RequestBody Department departmentDetails) {
        departmentService.updateDepartment(id, departmentDetails);
        System.out.println("Department updated");
    }

    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable Long id) {
        departmentService.deleteDepartment(id);
        System.out.println("Department deleted");
    }
    
    @GetMapping("/allemp")
    public ResponseEntity<String> getEmployees(){
    	return ResponseEntity.ok().body(departmentFeignClient.employeeResponse());
    }
}
