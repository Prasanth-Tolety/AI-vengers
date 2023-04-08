package com.example.onboarding;

public class Students {
    String name;

    String email;

    String password;

    String[] courses;

    String[] assignments;

    public Students(){

    }

    public Students(String name, String email, String password, String[] courses, String[] assignments ){
        this.name=name;
        this.email=email;
        this.password=password;
        this.courses=courses;
        this.assignments=assignments;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
