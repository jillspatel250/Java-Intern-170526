package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Autowire1.xml");
        Emp e=(Emp)context.getBean("emp1");
        System.out.println(e);



    }
}
