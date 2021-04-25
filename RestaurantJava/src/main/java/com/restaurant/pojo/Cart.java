/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.pojo;

import java.math.BigDecimal;

/**
 *
 * @author HP
 */
public class Cart {
    private int serviceId;
    private int eventId;
    private BigDecimal priceService;
    private BigDecimal priceEvent;
    
    public Cart(int serviceId, int eventId, BigDecimal priceService, BigDecimal priceEvent){
        this.serviceId = serviceId;
        this.eventId = eventId;
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
 
}
