package com.andinh.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        // load the config
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

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
