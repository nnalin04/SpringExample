package com.bridgelabz.springexample.constructor;

import com.bridgelabz.springexample.setterMethod.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        com.bridgelabz.springexample.constructor.Student student = context.getBean("student2",
                com.bridgelabz.springexample.constructor.Student.class);
        student.displayStudentDetail();

        ApplicationContext cont = new ClassPathXmlApplicationContext("beans.xml");
        com.bridgelabz.springexample.constructor.Student stu =
                cont.getBean("stu2", com.bridgelabz.springexample.constructor.Student.class);
        stu.displayStudentDetail();

    }
}
