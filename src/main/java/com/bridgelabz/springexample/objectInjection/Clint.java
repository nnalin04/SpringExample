package com.bridgelabz.springexample.objectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Clint {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Examinees examinees = context.getBean("exainee", Examinees.class);
        examinees.cheating();
    }
}
