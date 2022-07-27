package com.andinh.hibernate;

import org.springframework.beans.factory.DisposableBean;

public class TennisCoach implements Coach, DisposableBean {

    private FortuneService fortuneService;

    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "10 round of tennis coach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff() {
        System.out.println("TennisCoach: inside doMyStartupStuff()");
    }

    // add an clean up method
    public void doMyCleanUpStuff() {
        System.out.println("TennisCoach: inside doMyStartupStuff()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("TennisCoach: inside method doMyCleanupStuffYoYo");
    }
}
