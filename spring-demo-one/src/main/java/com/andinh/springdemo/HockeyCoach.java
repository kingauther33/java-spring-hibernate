package com.andinh.springdemo;

public class HockeyCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Swing 30 bats";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
