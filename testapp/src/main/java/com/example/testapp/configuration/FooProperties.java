package com.example.testapp.configuration;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


//Note
//Spring provides further stereotype annotations: @Component, @Service, and @Controller.
//@Component is a generic stereotype for any Spring-managed component. @Repository, @Service,
//and @Controller are specializations of @Component for more specific use cases, for example,
//in the persistence, service, and presentation layers, respectively. Therefore, you can
//annotate your component classes with @Component, but by annotating them with @Repository,
//@Service, or @Controller instead, your classes are more properly suited for processing by
//tools or associating with aspects. For example, these stereotype annotations make ideal
//targets for pointcuts. It is also possible that @Repository, @Service, and @Controller
//may carry additional semantics in future releases of the Spring Framework. Thus, if you are
//choosing between using @Component or @Service for your service layer, @Service is clearly
//the better choice. Similarly, as stated above, @Repository is already supported as a marker
//for automatic exception translation in your persistence layer.


@Component
@ConfigurationProperties(prefix = "foo")
@Validated
public class FooProperties {
    @NotNull
    private int a;
    @Valid //for nested properties
    private Obj obj = new Obj();
    private int notexist;
//    method 2 for nested properties
//    private Obj obj;

    public void setA(int a){
        this.a = a;
    }

    public void setNotexist(int notexist){
        this.notexist = notexist;
    }

//    method 2
//    public void setObj(Obj obj){
//        System.out.println("setObj");
//        this.obj = new Obj(obj.getB(), obj.getC());
//    }

    public int getA() {
        return a;
    }

    public Obj getObj() {
        return obj;
    }

    public int getNotexist() {
        return notexist;
    }

    public static class Obj{
        private int b;
        @NotEmpty
        private String c;
//        method 2
//        public Obj(){
//            System.out.println("Obj default constructor");
//
//        }
//        public Obj(int b, String c){
//            System.out.println("Obj Obj(b,c) constructor");
//            this.b = b;
//            this.c = c;
//        }

        public void setB(int b) {
            this.b = b;
        }

        public int getB() {
            return b;
        }

        public void setC(String c) {
            this.c = c;
        }

        public String getC() {
            return c;
        }
    }

}
