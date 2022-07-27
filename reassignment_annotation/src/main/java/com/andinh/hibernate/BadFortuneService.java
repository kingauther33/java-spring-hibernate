package com.andinh.hibernate;

import org.springframework.stereotype.Component;

@Component
public class BadFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Bad Fortune!";
    }
}
