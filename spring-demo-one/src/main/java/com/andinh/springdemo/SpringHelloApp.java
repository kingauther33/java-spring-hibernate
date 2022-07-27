package com.andinh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve beans from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // compare the two coach
        boolean isTheSame = theCoach == alphaCoach;

        System.out.println(isTheSame);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call fortune method
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
