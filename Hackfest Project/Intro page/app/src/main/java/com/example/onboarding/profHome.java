package com.example.onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class profHome extends AppCompatActivity {

    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prof_home);

        Intent j = getIntent();
        String email = j.getStringExtra("email");
        s=email;
    }
    public void assignments(View v){
        Intent i= new Intent(profHome.this,fireBaseActivity.class);
        startActivity(i);
    }

    public void materials(View v){
        Intent i= new Intent(profHome.this,materialsFireBase.class);
        startActivity(i);
    }
    public void logout(View v){
        Intent i= new Intent(profHome.this,mainscreen.class);
        startActivity(i);
    }
    public void profile(View v){
        Intent i= new Intent(profHome.this,profProfile.class);
        i.putExtra("email",s);
        startActivity(i);
    }
}