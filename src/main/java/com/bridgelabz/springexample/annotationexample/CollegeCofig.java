package com.bridgelabz.springexample.annotationexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan( basePackages = "com.bridgelabz.springexample.annotationexample")
public class CollegeCofig {

    @Bean
    public Teacher teacherBean() {
        return new MathTeacher();
    }

    @Bean
    public Principal principalBean() {
        return new Principal();
    }

    @Bean
    public College collegeBean() {
        College college = new College();
        college.setTeacher(teacherBean());
        college.setPrincipal(principalBean());
        return college;
    }
}
