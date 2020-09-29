package com.bridgelabz.springexample.ioc;

public class Jio implements Sim{
    @Override
    public void calling() {
        System.out.println("calling using airtle mobile");
    }

    @Override
    public void data() {
        System.out.println("browsing internet using Airtle");
    }
}
