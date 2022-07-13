package com.example.springmvcdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    @Value("#{languageOptions}")
    private Map<String, String> languageOptions;

    @Value("#{languageOptions}")
    private Map<String, String> systemOptions;

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        // create a student object
        Student theStudent = new Student();

        // add a student object to the model
        theModel.addAttribute("student", theStudent);

        theModel.addAttribute("theCountryOptions", countryOptions);

        theModel.addAttribute("theLanguageOptions", languageOptions);

        theModel.addAttribute("theSystemOptions", systemOptions);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {

        // log the input data
        System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());
        return "student-confirmation";
    }
}
