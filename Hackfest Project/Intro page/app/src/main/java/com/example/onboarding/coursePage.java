package com.example.onboarding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class coursePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_page);
        Intent i = getIntent();
        String msg = i.getStringExtra("email");

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("Students").child(msg.substring(0,(msg.length()-10)));
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String name1 = snapshot.child("Courses").child("0").getValue().toString();
                TextView courseName1 = (TextView) findViewById(R.id.button1);
                courseName1.setText( name1);

                String name2 = snapshot.child("Courses").child("1").getValue().toString();
                TextView courseName2 = (TextView) findViewById(R.id.button2);
                courseName2.setText(name2);

                String name3 = snapshot.child("Courses").child("2").getValue().toString();
                TextView courseName3 = (TextView) findViewById(R.id.button3);
                courseName3.setText( name3);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public void materials(View v){
        Intent i= new Intent(coursePage.this,materials.class);
        startActivity(i);
    }
}