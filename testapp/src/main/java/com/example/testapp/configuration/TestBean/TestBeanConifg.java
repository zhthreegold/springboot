package com.example.testapp.configuration.TestBean;

import com.example.testapp.service.TestBean.TestBeanService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//When @Configuration classes are provided as input, the @Configuration class itself
//is registered as a bean definition, and all declared @Bean methods within the class
//are also registered as bean definitions.

//This is useful when you want to wire components from 3rd-party libraries.
//Since you don't have the source code so you can't annotate its classes with @Component,
//so automatic configuration is not possible.

@Configuration
public class TestBeanConifg {

    @Bean
    TestBeanService testBeanService(){
        return new TestBeanService();
    }

}
