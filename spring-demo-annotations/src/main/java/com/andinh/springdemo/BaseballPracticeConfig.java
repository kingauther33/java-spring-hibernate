package com.andinh.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseballPracticeConfig {

    @Bean
    public FortuneService normalFortuneService() {
        return new NormalFortuneService();
    }

    @Bean
    public BaseballCoach baseballCoach() {
        return new BaseballCoach(normalFortuneService());
    }
}
