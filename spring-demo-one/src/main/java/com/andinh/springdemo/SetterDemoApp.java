package com.andinh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        // load the Spring Configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // call methods
        System.out.println(theCoach.getDailyFortune());

        // call our new methods to get the literal values
        System.out.println(theCoach.getEmailAddress());

        System.out.println(theCoach.getTeam());

        // close contexts
        context.close();
    }
}