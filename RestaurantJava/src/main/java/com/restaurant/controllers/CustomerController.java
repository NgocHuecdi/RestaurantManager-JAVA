/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.controllers;

import com.restaurant.pojo.Customer;
//import com.restaurant.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author OS
 */
@Controller
public class CustomerController {
//    @Autowired
//    private CustomerService userDetailsService;
//    
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    
    @GetMapping("/register")
    public String registerView(Model model) {
        model.addAttribute("customer", new Customer());
        return "register";
    }
    
//    @PostMapping("/register")
//    public String register(Model model,
//            @ModelAttribute(value = "useName") Customer useName) {
////        user.setUserRole("ROLE_USER");
//        if (!this.userDetailsService.addCustomer(useName)) {
//            model.addAttribute("errMsg", "Something Wrong!");
//            return "register";
//        }
//            
//        return "redirect:/";
//    }
}
