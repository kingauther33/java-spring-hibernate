package com.andinh.hibernate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class JavaAnnotationDemo {
    public static void main(String[] args) throws IOException {
        // load the config
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the beans
        Coach theCoach = context.getBean("cricketCoach", Coach.class);
        Coach alphaCoach = context.getBean("cricketCoach", Coach.class);

        // call method
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(alphaCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
