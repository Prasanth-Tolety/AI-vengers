package com.example.onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.ktx.Firebase;

public class studentHome extends AppCompatActivity {
    String s;
    ImageButton btnLogOut;
    FirebaseAuth mAuth;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_home);
        Intent j = getIntent();
        String email = j.getStringExtra("email");
        s=email;

        btnLogOut = findViewById(R.id.logout);
        mAuth = FirebaseAuth.getInstance();

        btnLogOut.setOnClickListener(view -> {
            mAuth.signOut();
            startActivity(new Intent(studentHome.this, mainscreen.class));

        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        if(user == null){
            startActivity(new Intent(studentHome.this, mainscreen.class));
        }
    }

    public void logout(View v){
        Intent i= new Intent(studentHome.this,mainscreen.class);
        startActivity(i);
    }
    public void profile(View v){
        Intent i= new Intent(studentHome.this,studentProfile.class);
        i.putExtra("email",s);
        startActivity(i);
    }
    public void courses(View v){
        Intent i= new Intent(studentHome.this,coursePage.class);
        startActivity(i);
    }



}