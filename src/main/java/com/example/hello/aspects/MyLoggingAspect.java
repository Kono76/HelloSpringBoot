package com.example.hello.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class MyLoggingAspect {
    @Before("execution(* save(com.example.hello.entities.Customer))")
    public void logBeforeAddObjectToDB(){  //Advice
        System.out.println("**** Before adding customer to DB");
    }
}
