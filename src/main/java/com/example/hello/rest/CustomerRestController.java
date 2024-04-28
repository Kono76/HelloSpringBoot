package com.example.hello.rest;

import com.example.hello.dao.CustomerDAO;
import com.example.hello.dao.NewCustomerDAO;
import com.example.hello.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerRestController {
//    @Autowired
//    private CustomerDAO dao;

    @Autowired
    private NewCustomerDAO dao;

    @GetMapping("/{id}")
    public Customer getCustomerbyId(@PathVariable int id){
        return dao.findById(id).get();
    }

    @GetMapping
    public List<Customer> getCustomerbyId(){
        return dao.findAll();
    }

    @GetMapping("/name/{name}")
    public Customer getCustomerbyName(@PathVariable String name){
        return dao.findByFirstName(name);
    }

    @GetMapping("/name/{fname}/{lname}")
    public Customer getCustomerbyFirstNameOrLastName(@PathVariable String fname,@PathVariable String lname){
        return dao.findByFirstNameOrLastName(fname,lname);
    }

    @GetMapping("/name/like/{name}")
    public List<Customer> getCustomerbyLikeName(@PathVariable String name){
        return dao.findCustomersLikeName(name);
    }

//    @PostMapping
//    public String createCustomer(@RequestBody Customer customer){
//        dao.save(customer);
//        return "inserted successfully in data base";
//    }

    @PutMapping
    public String showUpdateCustomerForm(@RequestBody Customer customer){
        dao.save(customer);
        return "Updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteCustomerById(@PathVariable("id") int id){
        dao.deleteById(id);
        return "deleted successfully";
    }
    @PostMapping
    public String addCustomer(@RequestBody Customer c){
        System.out.println("before calling dao from rest controller");
        dao.save(c);
        return "customer has been added successfully";
    }

}
