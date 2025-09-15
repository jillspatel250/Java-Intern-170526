package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//here we implement bean life cycle two method init and destroy using interfaces

public class Pespsi implements InitializingBean, DisposableBean {
    private double price;

    public double getPricce() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }
    public Pespsi(){
        super();
    }

    public Pespsi(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Pespsi{" +
                "price=" + price +
                '}';
    }

    //this is init method because this work after setting prop so aa init ni jem work karse
    @Override
    public void afterPropertiesSet() throws Exception {
        //init
        System.out.println("taking pepsi");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("going to put bottle in dustbin");
    }
}
