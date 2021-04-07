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
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    
//    @RequestMapping(value = "/addemp", method = RequestMethod.POST)
//    public String addemp() {
//        System.out.println("User Page Requested");
//        //
//        //       
//        //  Some way to figure how much money there is in the user's account. For our purposes, say $5.
//        //
//        //
////        model.addAttribute("account",account);
//        return "addemp";
//    }
}
