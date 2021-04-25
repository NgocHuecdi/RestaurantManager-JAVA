/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.utils;

import com.restaurant.pojo.Cart;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author HP
 */
public class Utils {

    public static Map<String, BigDecimal> cartStats(Map<Integer, Cart> sessionCart) {
        Map<String, BigDecimal> re = new HashMap<>();

        if (sessionCart != null) {
            Collection<Cart> carts = sessionCart.values();
            BigDecimal totalEvent = new BigDecimal(0);
            BigDecimal totalService = new BigDecimal(0);
            BigDecimal total = new BigDecimal(0);
            for (Cart c : carts) {
                totalService = totalService.add(c.getPriceService());
                totalEvent = totalEvent.add(c.getPriceEvent());
                total = totalService.add(totalEvent);

            }

            re.put("total", total);
//            re.put("totalQuantity", new BigDecimal(totalQuantity));
        } else {
            re.put("totalService", new BigDecimal(0));
            re.put("totalEvent", new BigDecimal(0));
        }

        return re;

    }
}
