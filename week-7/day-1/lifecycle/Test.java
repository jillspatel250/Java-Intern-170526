package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifecycleConf.xml");
        Samosa s=(Samosa) context.getBean("s1");
        System.out.println(s);
        context.registerShutdownHook();//here we say that call destory method jo apde register shutdown nai kariee toh destoryy
                                        // method call nai thayy
        //NOTE:- we use AbstractApplicationContext insted of ApplicationContext because this registerShutdownHook() method AbstractApplicationContext aa interface
        //jode che etle and aa AbstractApplicationContext is a parent of ApplicationContext this interface

        System.out.println("+++++++++++++++++++++++++++++++++");
        Pespsi p=(Pespsi)context.getBean("p1");
        System.out.println(p);

        Maggi m=(Maggi)context.getBean("m1");
        System.out.println(m);


    }
}
