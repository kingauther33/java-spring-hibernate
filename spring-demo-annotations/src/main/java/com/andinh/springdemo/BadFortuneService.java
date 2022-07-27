package com.andinh.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.Random;

@Component
public class BadFortuneService implements FortuneService{

    private String[] fortunes = {
            "Really Bad Fortune",
            "Bad Fortune",
            "Half-bad Fortune",
    };

    private StringBuilder badFortune = new StringBuilder();

    @PostConstruct
    public void startUp() throws IOException {
        readFile();
        System.out.println(">> BadFortuneService: in startUp()");
    }

    public void readFile() throws IOException {
        File file =  new File("/home/kingauther33/Projects/Training/java-spring-hibernate/spring-demo-annotations/src/main/resources/badfortune.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String lineString;
        while((lineString = bufferedReader.readLine()) != null) {
            System.out.println(badFortune);
            badFortune.append(lineString);
        }

    }

    private Random myRandom = new Random();
    @Override
    public String getFortune() {
        /*int index = myRandom.nextInt(fortunes.length);
        String theFortune = fortunes[index];
        return theFortune;*/
        return badFortune.toString();
    }
}
