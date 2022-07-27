package com.andinh.hibernate;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ReadFileFortuneService implements FortuneService {

    private List<String> fortunes = new ArrayList<>();

    public void readFile() throws IOException {
        File file = new File("/home/kingauther33/Projects/Training/java-spring-hibernate/reassignment_annotation/src/main/resources/fortunes.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String lineString;
        while((lineString = bufferedReader.readLine()) != null) {
            fortunes.add(lineString);
        }
    }

    private Random random = new Random();

    @PostConstruct
    public void doMyStartupStuff() throws IOException {
        readFile();
        System.out.println(">> ReadFileFortuneService: inside doMyStartupStuff()");
    }

    @Override
    public String getFortune() throws IOException {
        int index = random.nextInt(fortunes.size());
        String theFortune = fortunes.get(index);
        return theFortune;
    }
}
