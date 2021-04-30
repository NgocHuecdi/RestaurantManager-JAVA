/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "events")
public class Event implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int eventId;
    private String name;
//    private int hallId;
    private BigDecimal price;
    @OneToMany(mappedBy = "event", fetch = FetchType.EAGER)
    private List<BookDetail> bookDetail;
    
    @Override
    public String toString() {
        return String.valueOf(eventId);
    }

    /**
     * @return the eventId
     */
    public int getEventId() {
        return eventId;
    }

    /**
     * @param eventId the eventId to set
     */
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
//
//    /**
//     * @return the hallId
//     */
//    public int getHallId() {
//        return hallId;
//    }
//
//    /**
//     * @param hallId the hallId to set
//     */
//    public void setHallId(int hallId) {
//        this.hallId = hallId;
//    }
//    /**
//     * @return the bookDetail
//     */
//    public List<BookDetail> getBookDetail() {
//        return bookDetail;
//    }
//
//    /**
//     * @param bookDetail the bookDetail to set
//     */
//    public void setBookDetail(List<BookDetail> bookDetail) {
//        this.bookDetail = bookDetail;
//    }
}
