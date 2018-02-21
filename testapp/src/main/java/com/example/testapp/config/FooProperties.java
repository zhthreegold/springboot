package com.example.testapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "foo")
public class FooProperties {
    private int a;
    private Obj obj;

    public void setA(int a){
        this.a = a;
    }

    public void setObj(int b, String c){
        this.obj = new Obj(b, c);
    }

    public int getA() {
        return a;
    }

    public Obj getObj() {
        return obj;
    }

    public static class Obj{
        private int b;
        private String c;

        public Obj(int b, String c){
            this.b = b;
            this.c = c;
        }

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
