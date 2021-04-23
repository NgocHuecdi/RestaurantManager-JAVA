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
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author HP
 */
@Controller
public class HomeController {
    @Autowired
    private EmployeeService employeeService; 
    
//     @ModelAttribute
//    public void addAttributes(Model model, HttpSession session) {
//        model.addAttribute("employees", this.employeeService.getEmployeies(""));
//    }
    @RequestMapping("/") //mapping vao trang chu
    public String index(Model model,@RequestParam(name="name", required = false) String name){

        if(name != null){
            model.addAttribute("employeies", this.employeeService.getEmployeies(name));
        }
        else {
            model.addAttribute("employeies", this.employeeService.getEmployeies(""));
        }
        

       
        if(name != null){
            model.addAttribute("employeies", this.employeeService.getEmployeies(name));
        }
        else
             model.addAttribute("employeies", this.employeeService.getEmployeies(""));

        return "index";
    }
    
//    @RequestMapping("/")
//    public String searchEmp(Model model,@RequestParam(name="name", required = false) String name){
//         model.addAttribute("employeies", this.employeeService.getEmployeies(name));
//         return "index";
//    }
    
}
