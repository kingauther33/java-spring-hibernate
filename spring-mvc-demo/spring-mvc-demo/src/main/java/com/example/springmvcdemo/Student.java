package com.example.springmvcdemo;

import java.util.LinkedHashMap;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;

    private String country;

    private String favouriteLanguage;
    
    private LinkedHashMap<String, String> countryOptions;
    private List<String> languageOptions;
    private List<String> operatingSystems;

    public Student() {
        // populate country options: used ISO country code
        countryOptions = new LinkedHashMap<>();

        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("IN", "India");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public List<String> getLanguageOptions() {
        return languageOptions;
    }

    public void setLanguageOptions(List<String> languageOptions) {
        this.languageOptions = languageOptions;
    }

    public List<String> getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(List<String> operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
