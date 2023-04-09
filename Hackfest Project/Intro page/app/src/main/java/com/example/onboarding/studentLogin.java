package com.example.onboarding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class studentLogin extends AppCompatActivity {


    EditText etLoginEmail;
    EditText etLoginPass;
    TextView tvRegHere;
    Button btnLogin;

    FirebaseAuth mAuth;
//    ActivityReadDataBinding binding;

//    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        etLoginEmail = findViewById(R.id.etLoginEmail);
        etLoginPass = findViewById(R.id.etLoginPass);
        tvRegHere = findViewById(R.id.tvRegHere);
        btnLogin = findViewById(R.id.btnLogin);

        mAuth = FirebaseAuth.getInstance();

        btnLogin.setOnClickListener(view -> {
            loginUser();
        });
        tvRegHere.setOnClickListener(view -> {
            startActivity(new Intent(studentLogin.this, registrActivity.class));
        });
    }

    private void loginUser(){
        String email = etLoginEmail.getText().toString();
        String password = etLoginPass.getText().toString();

        if(TextUtils.isEmpty(email)){
            etLoginEmail.setError("Email cannot be empty");
            etLoginEmail.requestFocus();
        }
        else if(TextUtils.isEmpty(password)){
            etLoginPass.setError("password cannot be empty");
            etLoginPass.requestFocus();
        }
        else{
            mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(studentLogin.this,"User logged in Successfully",Toast.LENGTH_SHORT).show();
                        Intent i =new Intent(studentLogin.this, studentHome.class);
                        i.putExtra("email",email);
                        startActivity(i);
                    }
                    else{
                        Toast.makeText(studentLogin.this,"login error",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}



























//        EditText username1 = (EditText) findViewById(R.id.username1);
//        EditText password1 = (EditText) findViewById(R.id.password1);
//
//        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn1);
//
//        loginbtn.setOnClickListener(new View.OnClickListener() {
////            DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("Students");
//
////            Query query = databaseReference.orderByChild("email").equalTo(username1.getText().toString());
//
//            @Override
//            public void onClick(View v) {
////                databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
////                    @Override
////                    public void onDataChange(DataSnapshot dataSnapshot) {
////                        // This method will be called once with the value from the Firebase object
////                        String userName = dataSnapshot.getValue(String.class);
////                        if (username1.getText().toString().equals("admin") && password1.getText().toString().equals("admin")) {
////                            Intent i = new Intent(studentLogin.this, studentHome.class);
////                            startActivity(i);
////                            Toast.makeText(studentLogin.this, "Login_Succesful", Toast.LENGTH_SHORT).show();
////                        } else {
////                            Toast.makeText(studentLogin.this, "Login_Failed", Toast.LENGTH_SHORT).show();
////                        }
////                    }
////
////                    @Override
////                    public void onCancelled(DatabaseError error) {
////                        // Failed to read value
//////                        Log.w(TAG, "Failed to read value.", error.toException());
////
////                    }
////                });
//                if (username1.getText().toString().equals("admin") && password1.getText().toString().equals("admin")) {
//                Intent i = new Intent(studentLogin.this, studentHome.class);
//                startActivity(i);
//                Toast.makeText(studentLogin.this, "Login_Succesful", Toast.LENGTH_SHORT).show();
//            } else {
//                Toast.makeText(studentLogin.this, "Login_Failed", Toast.LENGTH_SHORT).show();
//            }
//
//            }
//        });
