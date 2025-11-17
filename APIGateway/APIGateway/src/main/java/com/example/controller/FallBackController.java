package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/fallback/employee")
    public ResponseEntity<String> employeeFallback() {
        return ResponseEntity.ok("Employee Service is currently unavailable. Please try again later.");
    }

    @GetMapping("/fallback/department")
    public ResponseEntity<String> departmentFallback() {
        return ResponseEntity.ok("Department Service is currently unavailable. Please try again later.");
    }

}
