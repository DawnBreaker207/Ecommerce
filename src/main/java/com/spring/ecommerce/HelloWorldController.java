package com.spring.ecommerce;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
    @RequestMapping
    public  String helloWorld(){
        return "Hello World From Spring Boot";
    }

    @RequestMapping
    public  String goodbye(){
        return "Goodbye From Spring Boot";
    }
}
`