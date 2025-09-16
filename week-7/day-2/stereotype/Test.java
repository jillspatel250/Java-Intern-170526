package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("Stereotype.xml");
        ////aaj bean name km apde toh student name evu toh kase xml file ma define nathi karyu
        //so class name je hoy ene camel case ma kari devanu e rete IOC container object banave so we use that name

        //NOTE:-aapde aa change karvu hoy toh Component Annotation ma jaine
        //@Component("ob") toh IOC container ob name no object banavse ..

        Student s1=(Student) context.getBean("student");
        Student s2=(Student) context.getBean("student");
        System.out.println(s1.getNicknames());

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
