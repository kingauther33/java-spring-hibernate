package com.andinh.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        // load the config
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

//        Coach racketcoach = context.getBean("racketCoach", Coach.class);

        // call method
        System.out.println(theCoach.getDailyWorkout());

        // call fortune method
        System.out.println(theCoach.getDailyFortune());

        // call our new swim coach methods ... has the props value injected
        System.out.println("Email: " + theCoach.getEmail());
        System.out.println("Team: " + theCoach.getTeam());

        // close context
        context.close();

    }
}
