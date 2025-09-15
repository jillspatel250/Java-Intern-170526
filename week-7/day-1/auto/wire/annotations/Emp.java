package com.springcore.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//Emp is dependent on Address so we use her autowired method insted of manually
//we use @Autowired with setter method , on filed (Address address) , on construcot so we use any method to set property so
// autowired we write on that so continer use that thing to set values

//have more then 1 beans hase to kayu inject karvu e vakhate autowired confused thai jase toh e time e apde kayu karvu che
//so we use @Qualifier("name_of_beans") that we want to inject ....
public class Emp {

    private Address address;

    public Address getAddress() {
        return address;
    }

    @Autowired
    @Qualifier("address1")
    public void setAddress(Address address) {
        System.out.println("setter method");
        this.address = address;
    }

    public Emp(){
        super();
    }

    public Emp(Address address) {
        System.out.println("constructor call");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
