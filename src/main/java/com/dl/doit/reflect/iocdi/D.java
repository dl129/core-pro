package com.dl.doit.reflect.iocdi;

/**
 * @Author: DannyDing
 * @Date: 2020-09-13 15:16
 */
public class D {

    private A a;

    private B b;

    public D() {
        System.out.println("D without param construct method invoke!");
    }

    public D(A a, B b) {
        System.out.println("D construct with param invoke!");
        this.a = a;
        this.b = b;
    }
}
