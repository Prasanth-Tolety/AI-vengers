package com.example.onboarding;

public class Teachers {
    String name;

    String email;

    String password;

    String course;


    public Teachers(){

    }

    public Teachers(String name, String email, String password, String course){
        this.name=name;
        this.email=email;
        this.password=password;
        this.course=course;
//        this.assignments=assignments;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    public String getCourse() {
        return course;
    }

}
