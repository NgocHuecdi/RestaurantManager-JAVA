/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.pojo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "customers")
public class Customer implements Serializable {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int customerId;
    private String name;
    private String phone;
    private String address;
    private String useName;
    private String password;
//    private boolean active;
    @Transient
    private String confirmPassword;
//    @OneToMany(mappedBy = "customers", fetch = FetchType.EAGER)
//    private List<BookDetail> bookDetail;
    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private List<BookDetail> bookDetail;
    
    @Override
    public String toString() {
        return String.valueOf(customerId);
    }
    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the customerId
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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
     * @return the useName
     */
    public String getUseName() {
        return useName;
    }

    /**
     * @param useName the useName to set
     */
    public void setUseName(String useName) {
        this.useName = useName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the confirmPassword
     */
    public String getConfirmPassword() {
        return confirmPassword;
    }

    /**
     * @param confirmPassword the confirmPassword to set
     */
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    /**
     * @return the feedback
     */
        /**
     * @return the bookDetail
     */
      /**
     * @return the bookDetail
     */
    public List<BookDetail> getBookDetail() {
        return bookDetail;
    }

    /**
     * @param bookDetail the bookDetail to set
     */
    public void setBookDetail(List<BookDetail> bookDetail) {
        this.bookDetail = bookDetail;
    }
    
    
}
