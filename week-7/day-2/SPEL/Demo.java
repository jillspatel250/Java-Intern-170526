package com.springcore.SPEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{22+22}")
    private int x;

    @Value("#{22 > 12 ? 5 : 66}")
    private int y;

    @Value("#{T(java.lang.Math).sqrt(144)}")
    private int z;

    @Value("#{T(java.lang.Math).PI}")
    private double q;

    @Value("#{ new java.lang.String('hello my name is jills')}")
    private String p;

    @Value("#{ 3 > 2 }")
    private boolean flag;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double getQ() {
        return q;
    }

    public void setQ(double q) {
        this.q = q;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", q=" + q +
                ", p='" + p + '\'' +
                ", flag=" + flag +
                '}';
    }
}
