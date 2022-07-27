package com.andinh.hibernate;

import org.springframework.context.annotation.Scope;

@Scope()
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Happy Fortune for today!";
    }
}
