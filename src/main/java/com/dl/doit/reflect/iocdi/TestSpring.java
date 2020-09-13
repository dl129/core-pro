package com.dl.doit.reflect.iocdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-di.xml");

        A a = context.getBean("a", A.class);
        B b = context.getBean("b", B.class);
        C c = context.getBean("c", C.class);

        D d = context.getBean("d", D.class);
        E e = context.getBean("e", E.class);
    }
}
