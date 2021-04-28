/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.controllers;

import com.restaurant.pojo.Feedback;
import com.restaurant.service.FeedbackService;
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
    
    @RequestMapping("/addFeedback")
    public String addView(Model model,
            @RequestParam(name = "feedbackId", required = false, defaultValue = "0") int feedbackId) {
        if (feedbackId == 0) {
            model.addAttribute("addFeedback", new Feedback());
        }

        return "addFeedback ";
    }
    @PostMapping("/addFeedback/add")
    public String addFeedback(Model model,
            @ModelAttribute(value = "feedback") @Valid Feedback feedback,
            BindingResult result) {
        if (result.hasErrors()) {
            return "feedback";
        }
        
        if (!this.feedbackService.addFeedback(feedback)) {
            model.addAttribute("error_msg", "SOMETHING WRONG!!! PLEASE COME BACK LATER!");
            return "feedback";
        }
        
        return "redirect:/feedback";
    }
    
    
}
