/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Book {

 

    private int serviceId;
    private int eventId;
    private int hallId;
    private int empId;
    private Date dateUse;
    private double numberGuest;
    private BigDecimal priceService;
    private BigDecimal priceEvent;
    
    public Book(int serviceId, int eventId,int hallId,int empId, Date dateUse, double numberGuest, 
            BigDecimal priceService, BigDecimal priceEvent){
        this.serviceId = serviceId;
        this.eventId = eventId;
        this.hallId = hallId;
        this.empId = empId;
        this.dateUse = dateUse;
        this.numberGuest = numberGuest;
        this.priceService = priceEvent;
        this.priceEvent = priceEvent;
    }

    /**
     * @return the serviceId
     */
    public int getServiceId() {
        return serviceId;
    }

    /**
     * @param serviceId the serviceId to set
     */
    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
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
     * @return the priceService
     */
    public BigDecimal getPriceService() {
        return priceService;
    }

    /**
     * @param priceService the priceService to set
     */
    public void setPriceService(BigDecimal priceService) {
        this.priceService = priceService;
    }

    /**
     * @return the priceEvent
     */
    public BigDecimal getPriceEvent() {
        return priceEvent;
    }

    /**
     * @param priceEvent the priceEvent to set
     */
    public void setPriceEvent(BigDecimal priceEvent) {
        this.priceEvent = priceEvent;
    }
    
    /**
     * @return the hallId
     */
    public int getHallId() {
        return hallId;
    }

    /**
     * @param hallId the hallId to set
     */
    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    /**
     * @return the dateUse
     */
    public Date getDateUse() {
        return dateUse;
    }

    /**
     * @param dateUse the dateUse to set
     */
    public void setDateUse(Date dateUse) {
        this.dateUse = dateUse;
    }

    /**
     * @return the numberGuest
     */
    public double getNumberGuest() {
        return numberGuest;
    }

    /**
     * @param numberGuest the numberGuest to set
     */
    public void setNumberGuest(double numberGuest) {
        this.numberGuest = numberGuest;
    }
    /**
     * @return the empId
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * @param empId the empId to set
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }
}
