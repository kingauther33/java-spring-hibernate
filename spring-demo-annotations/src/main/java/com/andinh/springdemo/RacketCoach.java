package com.andinh.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RacketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice your bed volley";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
