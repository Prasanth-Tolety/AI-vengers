package com.example.onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mainscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);
    }


    public void profClick(View v){
        Intent i = new Intent(mainscreen.this, profLogin.class );
        startActivity(i);
    }
    public void studentClick(View v){
        Intent i = new Intent(mainscreen.this, studentLogin.class );
        startActivity(i);
    }
}