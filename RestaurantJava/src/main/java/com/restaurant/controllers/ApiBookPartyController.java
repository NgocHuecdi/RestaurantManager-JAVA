/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.controllers;

import com.restaurant.pojo.Book;
import com.restaurant.pojo.BookDetail;
import com.restaurant.repository.BookDetailRepository;
import com.restaurant.repository.EventRepository;
import com.restaurant.repository.ServiceRepository;
import com.restaurant.service.BookDetailService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping("/api")
public class ApiBookPartyController {
  @Autowired
    private BookDetailService bookDetailService;
    
 
    @GetMapping("/viewBook")
    public ResponseEntity<List<Object[]>> getBookDetail() {
        return new ResponseEntity<>(this.bookDetailService.getBookDetail(null), HttpStatus.OK);
    }
}
