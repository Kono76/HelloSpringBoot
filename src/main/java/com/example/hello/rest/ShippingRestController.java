package com.example.hello.rest;

import com.example.hello.entities.Address;
import com.example.hello.entities.ShippingObj;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipping")
public class ShippingRestController {
    private ShippingObj shippingData;

    //add shipping data
    @PostMapping
    private ShippingObj insertShippingData(@RequestBody ShippingObj obj){
        System.out.println("shippingObj:" + obj);
//        return "your object has been inserted successfully";
        return obj;

    }


    //get shipping data
    @GetMapping
    public ShippingObj getShipping(){
        ShippingObj obj= new ShippingObj("sh100",new Address("Egypt","Cairo","Elyassmin"),1000,false);
        return obj;
    }

}
