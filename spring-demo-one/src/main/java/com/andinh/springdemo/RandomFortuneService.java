package com.andinh.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private String[] randomFortune = {
            "Bad Fortune",
            "Good Fortune",
            "Medium Luck Today!"
    };

    private Random random = new Random();

    @Override
    public String getFortune() {
        int index = random.nextInt(randomFortune.length);
        String theFortune = randomFortune[index];
        return theFortune;
    }
}
