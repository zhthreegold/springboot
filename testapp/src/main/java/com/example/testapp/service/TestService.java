package com.example.testapp.service;

import com.example.testapp.service.TestBean.TestBeanService;
import com.example.testapp.service.TestConfig.TestConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    //The Bean is created at TestBeanConfig
    private TestBeanService testBeanService;

    //Constructor-based DI
    //Can also use @Autowired to DI
    public TestService(TestBeanService testBeanService){
        this.testBeanService = testBeanService;
    }

    @Autowired
    private TestConfigService testConfigService;


    public void run(){

        //test @Bean
        testBeanService.getName();

        //test @ConfigurationProperties
        testConfigService.printFooProperties();

    }


}
