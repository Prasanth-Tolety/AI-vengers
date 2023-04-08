package com.example.onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class studentLogin extends AppCompatActivity {


//    ActivityReadDataBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);
        EditText username1 = (EditText) findViewById(R.id.username1);
        EditText password1 = (EditText) findViewById(R.id.password1);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn1);

        loginbtn.setOnClickListener(new View.OnClickListener() {
//            DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("Students");

//            Query query = databaseReference.orderByChild("email").equalTo(username1.getText().toString());

            @Override
            public void onClick(View v) {
//                databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(DataSnapshot dataSnapshot) {
//                        // This method will be called once with the value from the Firebase object
//                        String userName = dataSnapshot.getValue(String.class);
//                        if (username1.getText().toString().equals("admin") && password1.getText().toString().equals("admin")) {
//                            Intent i = new Intent(studentLogin.this, studentHome.class);
//                            startActivity(i);
//                            Toast.makeText(studentLogin.this, "Login_Succesful", Toast.LENGTH_SHORT).show();
//                        } else {
//                            Toast.makeText(studentLogin.this, "Login_Failed", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//
//                    @Override
//                    public void onCancelled(DatabaseError error) {
//                        // Failed to read value
////                        Log.w(TAG, "Failed to read value.", error.toException());
//
//                    }
//                });
                if (username1.getText().toString().equals("admin") && password1.getText().toString().equals("admin")) {
                Intent i = new Intent(studentLogin.this, studentHome.class);
                startActivity(i);
                Toast.makeText(studentLogin.this, "Login_Succesful", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(studentLogin.this, "Login_Failed", Toast.LENGTH_SHORT).show();
            }

            }
        });
    }
}