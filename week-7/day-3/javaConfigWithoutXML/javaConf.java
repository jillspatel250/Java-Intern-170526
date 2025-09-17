package com.springcore.javaConfigWithoutXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaConfigWithoutXML") this is not need because not use @Component ..we use @Bean
public class javaConf {


    @Bean
    public Samosa getSamosa(){
        Samosa samosa=new Samosa();
        return samosa;
    }
    @Bean(name ={"student","temp","con"})
    public Student getStudent(){
        //creating a new object
        Student student=new Student(getSamosa());
        return student;
    }


}
