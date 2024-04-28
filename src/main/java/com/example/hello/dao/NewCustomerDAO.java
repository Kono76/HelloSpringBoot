package com.example.hello.dao;

import com.example.hello.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface NewCustomerDAO extends JpaRepository<Customer, Integer> {
    public Customer findByFirstName(String firstName);  //FirstName lazm tkoon nfs el property name bta3 el class
    public Customer findByFirstNameOrLastName(String firstName,String lastName);
    @Query("from Customer c where c.firstName like ?1")
    public List<Customer> findCustomersLikeName(String name);



}
