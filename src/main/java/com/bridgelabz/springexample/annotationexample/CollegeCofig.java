package com.bridgelabz.springexample.annotationexample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan( basePackages = "com.bridgelabz.springexample.annotationexample")
//@PropertySource("classPath:college-info.properties")
public class CollegeCofig {
}
