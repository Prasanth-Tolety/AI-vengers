package com.example.onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class studentProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile);
        Intent i = getIntent();
        String msg = i.getStringExtra("email");
        TextView mail = (TextView) findViewById(R.id.textView2);
        mail.setText(msg);
    }
}