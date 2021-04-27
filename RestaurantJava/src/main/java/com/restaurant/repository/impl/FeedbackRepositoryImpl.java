/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.repository.impl;

import com.restaurant.pojo.Customer;
import com.restaurant.pojo.Feedback;
import com.restaurant.repository.FeedbackRepository;
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
 * @author OS
 */
@Repository
public class FeedbackRepositoryImpl implements FeedbackRepository {

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Object[]> getFeedbacks(String kw) {
        Session session = this.sessionFactory.getObject().getCurrentSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Object[]> query = builder.createQuery(Object[].class);
        Root customerRoot = query.from(Customer.class);
        Root feedbackRoot = query.from(Feedback.class);
        
        query = query  .where(builder.and(
                    builder.equal(customerRoot.get("customerId"), feedbackRoot.get("customer"))
        ));
        
         query.multiselect(feedbackRoot.get("feedbackId"), 
                customerRoot.get("name").as(String.class),
                feedbackRoot.get("description").as(String.class),
                feedbackRoot.get("date").as(String.class));
         
        Query q = session.createQuery(query);
        return q.getResultList();
    }
}
