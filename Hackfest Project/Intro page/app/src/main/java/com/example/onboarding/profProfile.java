package com.example.onboarding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class profProfile extends AppCompatActivity {

    TextView name,course;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prof_profile);
        Intent i = getIntent();
        String msg = i.getStringExtra("email");
        TextView mail = (TextView) findViewById(R.id.textView2);
        mail.setText(msg);

        name = (TextView) findViewById(R.id.textView);
        course = (TextView) findViewById(R.id.textView3);
        name.setText(msg.substring(0,(msg.length()-10)));

        course.setText("ECE");


    }
}