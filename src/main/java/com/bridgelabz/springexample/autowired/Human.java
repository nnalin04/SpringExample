package com.bridgelabz.springexample.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    private Heart heart;

    public Human() {
    }

    public Human(Heart heart) {
        this.heart = heart;
    }

    @Autowired
    @Qualifier("HumanHeart")
    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void startPumping(){
        if (heart != null){
            heart.pump();
            System.out.println("type of animal "+heart.getTypeOfAnimal());
            System.out.println("No of Heart "+ heart.getNoOfHeart());
        }else
            System.out.println("you are dead");
    }
}
