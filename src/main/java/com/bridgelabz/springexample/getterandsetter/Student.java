package com.bridgelabz.springexample.getterandsetter;

public class Student {

    private String studentName;

    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void displayStudentDetail(){
        System.out.println("Student Name :- "+ this.studentName );
        System.out.println("Student Id :- "+ this.id+"\n");
    }
}
