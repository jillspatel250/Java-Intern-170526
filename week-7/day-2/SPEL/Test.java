package com.springcore.SPEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        //first we neec spring container obj so we make using ApplicationContext
        ApplicationContext context=new ClassPathXmlApplicationContext("SPELconf.xml");
        Demo demo1=(Demo)context.getBean("demo");
        System.out.println(demo1);



        SpelExpressionParser parser=new SpelExpressionParser();
        Expression exp=parser.parseExpression("22+22");
        System.out.println(exp.getValue());

    }
}
