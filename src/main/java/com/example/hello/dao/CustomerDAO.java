package com.example.hello.dao;

import com.example.hello.entities.Customer;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAO {

    @Autowired
    private EntityManager em;

    public Customer getCustomerById(int id){
        return em.find(Customer.class,id);
    }

    public void createCustomer(Customer customer) {
        em.persist(customer);
    }





}
