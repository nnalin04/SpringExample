package com.bridgelabz.springexample.loadingformpropertiesfile;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Trainee {

    @Value("${trainee.name}")
    private String name;

    @Value("${trainee.interestedCourse}")
    private String interestedCourse;

    @Value("${trainee.hobby}")
    private String hobby;

    public void displayTraineeInfo() {
        System.out.println("Trainee name "+ this.name);
        System.out.println("Trainee interested course "+ this.interestedCourse);
        System.out.println("Trainee hobby "+ this.hobby);

    }
}
