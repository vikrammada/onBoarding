package com.example.activity_sample;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);
        Button submit=findViewById(R.id.Submit);
        EditText fn=findViewById(R.id.Firstname);
        EditText ln=findViewById(R.id.Lastname);
        EditText email=findViewById(R.id.Email);
        EditText pwd=findViewById(R.id.Passwd);
        EditText cfpwd=findViewById(R.id.Confirmpwd);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(fn.getText().toString()) ||
                        TextUtils.isEmpty(ln.getText().toString())||
                        TextUtils.isEmpty(email.getText().toString()) ||
                        TextUtils.isEmpty(pwd.getText().toString())||
                        TextUtils.isEmpty(cfpwd.getText().toString()))
                    Toast.makeText(getApplicationContext(),"Fields Should Not Be Empty",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"Registration Is Successful",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
