package com.springcore.lifecycle;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Maggi {
    private String maggi_type;

    public String getMaggi_type() {
        return maggi_type;
    }

    public void setMaggi_type(String maggi_type) {
        this.maggi_type = maggi_type;
    }

    public Maggi() {
        super();
    }

    @Override
    public String toString() {
        return "Maggi{" +
                "maggi_type='" + maggi_type + '\'' +
                '}';
    }

    @PostConstruct
    public void start(){
        System.out.println("starting method");
    }

    @PreDestroy
    public void end(){
        System.out.println("ending method");
    }
}
