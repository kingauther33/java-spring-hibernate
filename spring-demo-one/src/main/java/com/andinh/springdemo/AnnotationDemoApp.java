package com.andinh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        // load the context
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the bean
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // use the bean
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
