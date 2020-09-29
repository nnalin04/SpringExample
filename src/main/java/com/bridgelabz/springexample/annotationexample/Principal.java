package com.bridgelabz.springexample.annotationexample;

import org.springframework.stereotype.Component;

@Component
public class Principal {

    public void principalInfo() {
        System.out.println("Hi i am your Principal");
        System.out.println("My Name is Pappu");
    }
}
