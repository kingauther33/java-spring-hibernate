package com.andinh.hibernate;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

    private String[] fortunes = {
            "Bad Fortune :(",
            "Happy Fortune :)",
            "Normal Day :D"
    };

    @Override
    public String getFortune() {
        return getRandomFortune();
    }

    private String getRandomFortune() {
        Random myRandom = new Random();
        int i = myRandom.nextInt(fortunes.length);
        return fortunes[i];
    }
}
