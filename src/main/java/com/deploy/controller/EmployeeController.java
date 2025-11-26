package com.deploy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @PostMapping("/create")
    public ResponseEntity<String> createEmployee() {
        System.out.println("Employee Created");
        return ResponseEntity.ok("Employee Created");
    }

    @GetMapping("/get")
    public ResponseEntity<String> getEmployee() {
        System.out.println("Employee Fetched");
        return ResponseEntity.ok("Employee Fetched");
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmployee() {
        System.out.println("Employee Updated");
        return ResponseEntity.ok("Employee Updated");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteEmployee() {
        System.out.println("Employee Deleted");
        return ResponseEntity.ok("Employee Deleted");
    }
}
