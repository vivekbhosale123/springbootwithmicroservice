package com.vdb.controller;

import com.vdb.model.Employee;
import com.vdb.service.EmployeeService;
import com.vdb.vo.RestTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<Employee> save(@RequestBody Employee employee)
    {
        return ResponseEntity.ok(employeeService.save(employee));
    }

    @GetMapping("/findbyid/{empId}")
    public ResponseEntity<RestTemplateVo> findById(@PathVariable int empId)
    {
        return ResponseEntity.ok(employeeService.findById(empId));
    }


}
