package com.bridgelabz.springexample.annotationexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {

    /*@Value("${college.name}")
    private String collegeName;*/

    @Autowired
    private Principal principal;

    @Autowired
    @Qualifier("scienceTeacher")
    private Teacher teacher;

    public void testMethod() {
        principal.principalInfo();
        teacher.teach();
    }
}
