package com.dl.doit.reflect.iocdi;

/**
 * @Author: DannyDing
 * @Date: 2020-09-13 15:16
 */
public class E {

    private A a;

    private B b;

    public void setA(A a) {
        System.out.println("E setA invoke!");
        this.a = a;
    }

    public void setB(B b) {
        System.out.println("E setB invoke!");
        this.b = b;
    }
}
