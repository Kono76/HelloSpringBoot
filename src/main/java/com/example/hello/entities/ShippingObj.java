package com.example.hello.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ShippingObj {
    private String shippingId;
    private Address address;
    private int code;
    private boolean active;

}
