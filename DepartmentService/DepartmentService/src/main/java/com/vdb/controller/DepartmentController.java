package com.vdb.controller;

import com.vdb.model.Department;
import com.vdb.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public ResponseEntity<Department> save(@RequestBody Department department)
    {
        return ResponseEntity.ok(departmentService.save(department));
    }

    @GetMapping("/findbyid/{deptId}")
    public ResponseEntity<Optional<Department>> findById(@PathVariable int deptId)
    {
        return ResponseEntity.ok(departmentService.findById(deptId));
    }

}
