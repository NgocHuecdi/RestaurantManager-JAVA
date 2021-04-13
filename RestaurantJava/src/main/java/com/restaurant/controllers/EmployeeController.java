/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.controllers;

import com.restaurant.pojo.Employee;
import com.restaurant.service.EmployeeService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author HP
 */
@Controller
@RequestMapping("/addemp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
   @RequestMapping("/")
    public String addView(Model model) {
        model.addAttribute("addemp", new Employee());
        
        return "addemp";
    }
    
    @PostMapping("/add")
   public String addEmploy(Model model,
       @ModelAttribute(value = "addemp") @Valid Employee emp,
        BindingResult result) {
        if (result.hasErrors()) {
            return "addemp";
        }
        
        if (!this.employeeService.addOrUpdateEmployee(emp)) {
            model.addAttribute("erroMsg", "Something Wrong!!!");
            return "addemp";
        }
        
        return "redirect:/";
    }
       
}
