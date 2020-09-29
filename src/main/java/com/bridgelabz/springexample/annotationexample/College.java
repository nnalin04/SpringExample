package com.bridgelabz.springexample.annotationexample;

//import org.springframework.stereotype.Component;

//@Component("collegeBean")
public class College {

    private Principal principal;

    private Teacher teacher;

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void testMethod() {
        principal.principalInfo();
        teacher.teach();
    }
}
