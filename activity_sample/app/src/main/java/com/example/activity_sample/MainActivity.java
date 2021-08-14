package com.example.activity_sample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view,LoginActivity.class,null)
                    .commit();
        }*/
        setContentView(R.layout.activity_main);
        Button login=findViewById(R.id.Login);
        Button signup=findViewById(R.id.Signup);
        EditText username=findViewById(R.id.Username);
        EditText pwd=findViewById(R.id.Password);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(pwd.getText().toString()))
                    Toast.makeText(getApplicationContext(),"Fields Should Not Be Empty",Toast.LENGTH_SHORT).show();
                else {
                    LoginActivity login=new LoginActivity();
                    getSupportFragmentManager()
                            .beginTransaction()
                            .add(R.id.fragmentContainerView,login,null)
                            .commit();
                    //FragmentManager fm=getFragmentManager();
                    //FragmentTransaction fc=fm.beginTransaction();
                    //fc.add(R.id.fragmentContainerView,login,null).commit();
                    //loadFragment(new LoginActivity());
                    /*String str=username.getText().toString();
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    intent.putExtra("user_name",str);
                    startActivity(intent);*/
                }
            }
        });

        /*signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Intent intent=new Intent(MainActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });*/
    }
    /*private void loadFragment(Fragment fragment){
        FragmentManager fm=getFragmentManager();
        FragmentTransaction fc=fm.beginTransaction();
        fc.add(R.id.framelayout,fragment,null).commit();



    }*/
}