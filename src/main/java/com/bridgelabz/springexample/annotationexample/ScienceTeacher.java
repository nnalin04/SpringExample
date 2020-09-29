package com.bridgelabz.springexample.annotationexample;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

    @Override
    public void teach() {
        System.out.println("i am your Science teacher");
        System.out.println("My name is Jemes");
    }
}
