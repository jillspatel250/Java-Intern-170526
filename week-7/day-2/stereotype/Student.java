package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.*;
@Component("student") //only aa use karsu toh object toh bani jase but value badhi null avse
//so we use @Value to fill value...
//and student name nu object nai kai bija name nu object banavu hoy toh we use
//@Component("obj_name") toh e name nu object banse
@Scope("prototype") //we set this then badha object different banse
//if we not usr this or not set bean scope to prototype then only singleton object j bane
//and apde jetli varr new object banavsu etli varr ej object nu reference apde provide thase
//if we use this then jetla bean create karsu etle new bean banse we check using print their hashCode()
public class Student {
    @Value("Jills Patel")
    private String studentname;

    @Value("Surat")
    private String city;

    @Value("#{temp}")
    private List<String> nicknames;

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getNicknames() {
        return nicknames;
    }

    public void setNicknames(List<String> nicknames) {
        this.nicknames = nicknames;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentname='" + studentname + '\'' +
                ", city='" + city + '\'' +
                ", nicknames=" + nicknames +
                '}';
    }
}
