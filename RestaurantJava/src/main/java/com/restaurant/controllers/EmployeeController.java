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
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author HP
 */
@Controller
//@RequestMapping("/addemp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    
    @RequestMapping("/employee") //mapping vao trang chu
    public String employee(Model model,@RequestParam(name="name", required = false) String name){

        if(name != null){
            model.addAttribute("employees", this.employeeService.getEmployeies(name));
        }
        else {
            model.addAttribute("employees", this.employeeService.getEmployeies(""));
        }
        return "employee";
    }
     
   @RequestMapping("/addemp")
    public String addView(Model model,
                    @RequestParam(name = "empId", required=false, defaultValue = "0") int empId) {
        if (empId > 0) 
            model.addAttribute("addemp", this.employeeService.getEmpById(empId));
           
        
        else   
            model.addAttribute("addemp", new Employee());
        
        return "addemp";
    }
    @RequestMapping("/updateEmp")
    public String updateEmploy(Model model,  
            @RequestParam(name = "empId", required=false, defaultValue = "0") int empId){
         if (empId > 0) 
            model.addAttribute("updateEmp", this.employeeService.getEmpById(empId));
        
        return "updateEmp";
    }
    
    @PostMapping("/addemp/add")
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
        
        return "redirect:/employee";
    }
       
}
