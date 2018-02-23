package com.example.testapp.service.TestBean;

import org.springframework.stereotype.Service;

//This bean is created at TestBeanConfig. Use @Service also work
//@Service
public class TestBeanService {

    String name;

    public TestBeanService(){
        System.out.println("TestBeanService Constructor is called");
        this.name = "TestBeanService";
    }

    public String getName(){
        System.out.println("TestBeanService getName is called");
        return this.name;
    }

}

