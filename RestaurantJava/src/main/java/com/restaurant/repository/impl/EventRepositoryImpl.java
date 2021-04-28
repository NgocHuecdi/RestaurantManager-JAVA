/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.repository.impl;

import com.restaurant.pojo.Event;
import com.restaurant.repository.EventRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public class EventRepositoryImpl implements EventRepository{

    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Override
    public List<Event> getEvents() {
        Session s = this.sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From Event");
        return q.getResultList();
     }

    @Override
    public Event getEventById(int eventId) {
         Session s = this.sessionFactory.getObject().getCurrentSession();
        return s.get(Event.class, eventId);
    }
    
}
