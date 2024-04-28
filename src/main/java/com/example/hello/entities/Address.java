package com.example.hello.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data  //setters and getter and contructor with fields
@NoArgsConstructor //empty constructor
@AllArgsConstructor
@ToString
public class Address {
    private String country;
    private String city;
    private String street;

}
