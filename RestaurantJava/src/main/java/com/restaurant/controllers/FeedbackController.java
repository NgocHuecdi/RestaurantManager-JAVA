/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.controllers;

import com.restaurant.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author OS
 */
@Controller

public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;
    @RequestMapping("/feedback")
    public String feedback(Model model, @RequestParam(name = "description", required=false) String description){
        model.addAttribute("feedback", this.feedbackService.getFeedbacks(""));
        
        return "feedback";
    }
    
    
}
