package com.bridgelabz.springexample.autowired;

public class Heart {

    private String typeOfAnimal;
    private int noOfHeart;

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public int getNoOfHeart() {
        return noOfHeart;
    }

    public void setNoOfHeart(int noOfHeart) {
        this.noOfHeart = noOfHeart;
    }

    public void pump() {
        System.out.println("Your hart is pumping");
        System.out.println("Alive");
    }
}
