package com.springcore.javaConfigWithoutXML;

import org.springframework.stereotype.Component;

public class Student {

    //herw we need to inject samosa bean so we declare in javaConf and inject here so we use that
    public Samosa samosa;
    public void study(){
        this.samosa.display();
        System.out.println("Student is reading books");
    }

    public Student(){
        super();
    }
    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }
}
