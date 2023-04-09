package com.example.onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class profLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prof_login);
        EditText username1 = (EditText) findViewById(R.id.username1);
        EditText password1 = (EditText) findViewById(R.id.password1);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn1);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username1.getText().toString().equals("himanshu@gmail.com") && password1.getText().toString().equals("himanshu123")||username1.getText().toString().equals("shashank@gmail.com") && password1.getText().toString().equals("1234")) {
                    Intent i = new Intent(profLogin.this, profHome.class);
                    i.putExtra("email", username1.getText().toString());
                    startActivity(i);
                    Toast.makeText(profLogin.this, "Login_Succesful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(profLogin.this, "Login_Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}