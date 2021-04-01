/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.controllers;



import com.restaurant.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author HP
 */
@Controller
public class HomeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/") //mapping vao trang chu
    public String index(Model model){
        model.addAttribute("message", "WELCOME TO RESTAURANT MANAGER");
        model.addAttribute("employeies", this.employeeService.getEmployeies());
        return "index";
    }
}
