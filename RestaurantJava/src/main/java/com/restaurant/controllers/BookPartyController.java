/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.controllers;

import com.restaurant.pojo.BookDetail;
import com.restaurant.service.BookDetailService;
import java.util.List;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author HP
 */
@Controller
public class BookPartyController {
   @Autowired
    private BookDetailService bookDetailService;

    @GetMapping("/viewBook") //mapping vao trang chu
    public String viewBook(Model model, @RequestParam(name = "bookDetailId", required = false) String bookDetailId) {
      
       List<Object[]> bookDetails = this.bookDetailService.getBookDetail(bookDetailId);
        model.addAttribute("bookDetails", bookDetails);
        return "viewBook";
    }

    @RequestMapping("/bookParty")
    public String addView(Model model,
            @RequestParam(name = "bookDetailId", required = false, defaultValue = "0") int bookDetailId) {
        if (bookDetailId > 0) {
            model.addAttribute("bookParty", new BookDetail());
        }

        return "bookParty";
    }

    @PostMapping("/bookParty/add")

    public String addBookParty(Model model,
            @ModelAttribute(value = "addBookParty") @Valid BookDetail bookdetail,
            BindingResult result) {
        if (result.hasErrors()) {
            return "bookParty";
        }

        if (!this.bookDetailService.addBook(bookdetail)) {
            model.addAttribute("erroMsg", "Something Wrong!!!");
            return "bookParty";
        }

        return "redirect:/bookParty";
    }
}
