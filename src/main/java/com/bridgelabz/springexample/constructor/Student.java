package com.bridgelabz.springexample.constructor;

public class Student {

    private String studentName;

    private int id;

    Student(int id) {
        this.id = id;
    }

    Student(String studentName, int id){
        this.studentName = studentName;
        this.id = id;
    }

    public void displayStudentDetail(){
        System.out.println("Student Name :- "+ this.studentName );
        System.out.println("Student Id :- "+ this.id+"\n");
    }
}
