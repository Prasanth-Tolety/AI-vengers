package com.example.onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class studentHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_home);

    }
    public void logout(View v){
        Intent i= new Intent(studentHome.this,mainscreen.class);
        startActivity(i);
    }
    public void profile(View v){
        Intent i= new Intent(studentHome.this,studentProfile.class);
        startActivity(i);
    }


}