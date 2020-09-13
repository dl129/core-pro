package com.dl.doit.reflect.iocdi;

/**
 * @Author: DannyDing
 * @Date: 2020-09-13 15:10
 */
public class A {
    public A() {
        System.out.println("A without param construct method invoke!");
    }

    public static B createBObj() { // static method factory
        System.out.println("A static createBObj() invoke!");
        return new B();
    }

    public C createCObj() { // instance method
        System.out.println("A's createCObj() invoke!");
        return new C();
    }
}
