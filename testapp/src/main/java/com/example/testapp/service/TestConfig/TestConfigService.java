package com.example.testapp.service.TestConfig;

import com.example.testapp.configuration.TestConfig.FooProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestConfigService {
    @Autowired
    private FooProperties fooProperties;

    public void printFooProperties() {
        System.out.println("foo.a: " + fooProperties.getA());
        System.out.println("foo.obj.b: " + fooProperties.getObj().getB());
        System.out.println("notexist: " + fooProperties.getNotexist());
    }

}
