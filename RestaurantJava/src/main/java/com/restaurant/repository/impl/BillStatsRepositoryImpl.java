/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.repository.impl;

import com.restaurant.pojo.Bill;
import com.restaurant.pojo.Customer;
import com.restaurant.pojo.Employee;
import com.restaurant.pojo.Event;
import com.restaurant.pojo.Services;
import com.restaurant.repository.BillStatsRepository;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author HP
 */
@Repository
public class BillStatsRepositoryImpl implements BillStatsRepository {
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    
    public List<Object[]> getBillStats(Date fromDate, Date toDate) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Object[]> query = builder.createQuery(Object[].class);
        
        //Join 2 Tabel
        
        //Bills with Customer
        Root customerRoot = query.from(Customer.class);
        Root billRoot = query.from(Bill.class);
         Root empRoot = query.from(Employee.class);
          Root serviceRoot = query.from(Services.class);
          Root eventRoot = query.from(Event.class);
        query = query  .where(builder.and(
                    builder.equal(customerRoot.get("customerId"), billRoot.get("customer")),
                    builder.equal(empRoot.get("empId"), billRoot.get("employee")),
                    builder.equal(serviceRoot.get("serviceId"), billRoot.get("services")),
                    builder.equal(eventRoot.get("eventId"), billRoot.get("event"))
            ));
       
        BigDecimal total = null;
//         //Select
         query.multiselect(billRoot.get("billId"), 
                customerRoot.get("name").as(String.class),
                empRoot.get("name").as(String.class),
                serviceRoot.get("name").as(String.class),
                eventRoot.get("name").as(String.class),
               billRoot.get("datePay").as(Date.class),
                builder.sum(eventRoot.<BigDecimal>get("price"), serviceRoot.<BigDecimal>get("unit_price")));
             
//         List<Object[]> resultList = session.createQuery(query).getResultList();
         query.groupBy(billRoot.get("billId"), 
                customerRoot.get("name").as(String.class),
               empRoot.get("name").as(String.class),
              serviceRoot.get("name").as(String.class),
               eventRoot.get("name").as(String.class),
                billRoot.get("datePay").as(Date.class)
         );
          if (fromDate != null && toDate != null) {
            Predicate p1 = builder.greaterThanOrEqualTo(
                    billRoot.get("datePay").as(Date.class), fromDate);
            Predicate p2 = builder.lessThanOrEqualTo(
                    billRoot.get("datePay").as(Date.class), toDate);
            query = query.having(p1, p2);
        }
        
        
        Query q = session.createQuery(query);
        return q.getResultList();
    }
    
}
