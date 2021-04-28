/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.service.impl;

import com.restaurant.pojo.Book;
import com.restaurant.pojo.BookDetail;
import com.restaurant.repository.BookDetailRepository;
import com.restaurant.service.BookDetailService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class BookDetailServiceImpl implements BookDetailService{
    @Autowired
    private BookDetailRepository bookDetailRepository;

    @Override
    public List<Object[]> getBookDetail(String kw) {
        return this.bookDetailRepository.getBookDetail(kw);
    }

    @Override
    public BookDetail getBookId(int bookId) {
        return this.bookDetailRepository.getBookId(bookId);
    }

    @Override
    public boolean addBook(BookDetail bookDetail) {
        return this.bookDetailRepository.addBook(bookDetail);
    }

    
    
}
