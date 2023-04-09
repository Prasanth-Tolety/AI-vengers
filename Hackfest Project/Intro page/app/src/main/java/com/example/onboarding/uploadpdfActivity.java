package com.example.onboarding;

public class uploadpdfActivity {
    public String name;
    public String url;

    public uploadpdfActivity(){

    }
    public uploadpdfActivity(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }



    public String getUrl() {
        return url;
    }
}
