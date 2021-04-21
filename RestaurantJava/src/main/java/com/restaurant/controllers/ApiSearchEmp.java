/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.controllers;

import com.restaurant.pojo.Employee;
import com.restaurant.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping("/api")
public class ApiSearchEmp {
      @Autowired
    private EmployeeService employeeService;
    
    @GetMapping("/searchEmp")
    public ResponseEntity<List<Employee>> getSearch() {
        return new ResponseEntity<>(this.employeeService.getSearch(null), HttpStatus.OK);
    }
}
