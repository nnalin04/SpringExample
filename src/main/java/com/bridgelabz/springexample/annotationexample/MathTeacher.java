package com.bridgelabz.springexample.annotationexample;

public class MathTeacher implements Teacher{

    @Override
    public void teach() {
        System.out.println("i am your Math teacher");
        System.out.println("My name is Jhon");
    }
}
