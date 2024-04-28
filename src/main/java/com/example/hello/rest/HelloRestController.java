package com.example.hello.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class HelloRestController {
    @GetMapping("/hello")
    public String sayHelloRestForGet(){
        return "Hello Rest Webservice from get handler";
    }
    @PostMapping("/hello")
    public String sayHelloRestForPost(){
        return "Hello Rest Webservice from Post handler";
    }
    @DeleteMapping("/hello")
    public String sayHelloRestForDelete(){
        return "Hello Rest Webservice from Delete handler";
    }
    @RequestMapping("/hello")
    public String sayHelloRestForRequest(){
        return "Hello Rest Webservice from request mapping handler";
    }
}
