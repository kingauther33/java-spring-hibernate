package com.andinh.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BaseballJavaConfigDemoApp {
    public static void main(String[] args) {
        // load the config
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

//        Coach racketcoach = context.getBean("racketCoach", Coach.class);

        // call method
        System.out.println(theCoach.getDailyWorkout());

        // call fortune method
        System.out.println(theCoach.getDailyFortune());

        // close context
        context.close();

    }
}
