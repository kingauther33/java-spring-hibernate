package com.andinh.springdemo;

public class BaseballCoach implements Coach{

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Daily Swing the Bat";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
