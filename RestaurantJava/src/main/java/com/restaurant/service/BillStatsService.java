/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.service;

import java.util.Date;
import java.util.List;

/**
 *
 * @author HP
 */
public interface BillStatsService {
     List<Object[]> getBillStats(Date fromDate, Date toDate);
}