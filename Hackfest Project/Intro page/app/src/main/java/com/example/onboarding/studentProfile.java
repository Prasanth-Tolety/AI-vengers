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

public class studentProfile extends AppCompatActivity {

    TextView name,branch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile);
        Intent i = getIntent();
        String msg = i.getStringExtra("email");
        TextView mail = (TextView) findViewById(R.id.textView2);
        mail.setText(msg);

        name = (TextView) findViewById(R.id.textView);
        branch = (TextView) findViewById(R.id.textView3);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("Students").child(msg.substring(0,(msg.length()-10)));

        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String name1 = snapshot.child("Name").getValue().toString();
                String branch1 = snapshot.child("Branch").getValue().toString();
                name.setText("Name: "+name1);
                branch.setText("Branch: "+branch1);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}