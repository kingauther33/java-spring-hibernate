package com.andinh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        // load the config
        ClassPathXmlApplicationContext context =
                    new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

//        Coach racketcoach = context.getBean("racketCoach", Coach.class);

        // call method
        System.out.println(tennisCoach.getDailyWorkout());

        // call fortune method
        System.out.println(tennisCoach.getDailyFortune());

        // close context
        context.close();
    }
}
