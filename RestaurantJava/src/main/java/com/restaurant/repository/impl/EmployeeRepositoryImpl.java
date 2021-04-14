/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.repository.impl;

import com.restaurant.pojo.Employee;
import com.restaurant.repository.EmployeeRepository;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author HP
 */
@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    @Transactional
    public List<Employee> getEmployeies(String kw) {
        
        Session s = this.sessionFactory.getObject().getCurrentSession();
        
        CriteriaBuilder builder = s.getCriteriaBuilder();
        CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
        Root root = query.from(Employee.class);
        query.select(root);

        if (kw != null && !kw.isEmpty()) {
            Predicate p = builder.like(root.get("name").as(String.class),
                    String.format("%%%s%%", kw));
            query = query.where(p);
        }

        Query q = s.createQuery(query);
        return q.getResultList();

    }

    @Override
    @Transactional 
   public boolean addOrUpdateEmployee(Employee emp) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        try {
            if (emp.getEmpId() > 0) {
                session.update(emp);
            } else {
                session.save(emp);
            }
            return true;
        } catch (HibernateException ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    @Transactional
    public boolean deleteEmployee(int employeeId) {
        try{
            Session session = this.sessionFactory.getObject().getCurrentSession();
            session.delete(session.get(Employee.class, employeeId));
            
            return true;
        } catch(HibernateException ex){
            ex.printStackTrace();
        }
        
        return false;
    }

    @Override
    @Transactional
    public Employee getEmpById(int empId) {
         Session s = this.sessionFactory.getObject().getCurrentSession();
        return s.get(Employee.class, empId);
   }

   
}
