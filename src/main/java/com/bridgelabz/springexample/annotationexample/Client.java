package com.bridgelabz.springexample.annotationexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeCofig.class);
        College college = context.getBean("collegeBean", College.class);
        college.testMethod();
    }
}
