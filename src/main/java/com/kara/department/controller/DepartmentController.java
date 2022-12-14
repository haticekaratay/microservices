package com.kara.department.controller;

import com.kara.department.entity.Department;
import com.kara.department.repository.DepartmentRepository;
import com.kara.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("inside saveDepartment Method of Department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("inside findDepartmentById Method of Department Controller");
        return departmentService.findDepartmentById(departmentId);
    }
}
