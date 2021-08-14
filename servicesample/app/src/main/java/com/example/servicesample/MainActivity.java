package com.example.servicesample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button statSer, stopper;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        statSer=findViewById(R.id.button);
        stopper = findViewById(R.id.button2);
        statSer.setOnClickListener(this);
        stopper.setOnClickListener(this);
        /*statSer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent= new Intent(MainActivity.this,MyServiceApp.class);
                startService(intent);
            }
        });
        stopser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(MainActivity.this,MyServiceApp.class);
                stopService(intent);
            }
        });*/
    }

    @Override
    public void onClick(View v) {
        if(v==statSer){
            intent= new Intent(MainActivity.this,MyServiceApp.class);
            startService(intent);
        }else if(v== stopper){
            intent= new Intent(MainActivity.this,MyServiceApp.class);
            stopService(intent);
        }

    }
}