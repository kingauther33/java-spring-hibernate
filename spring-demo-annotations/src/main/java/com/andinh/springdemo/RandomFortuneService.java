package com.andinh.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    private String[] data = {
            "Beaware",
            "Diligence",
            "Reward"
    };

    @Value("${foo.email}")
    private String email;
    @Value("${foo.password}")
    private String password;

    private Random myRandom = new Random();
    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune + email + password;
    }
}
