package com.example.button_prj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.button_main);
                RadioGroup rgender=findViewById(R.id.rg_gender);
                Button btn_submit=findViewById(R.id.button_submit);
                btn_submit.setOnClickListener(new View.OnClickListener() {
                      @Override
                        public void onClick(View v) {
                            int checkid=rgender.getCheckedRadioButtonId();
                            if(checkid == -1){
                                Toast.makeText(getApplicationContext(),"select the gender",Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                Toast.makeText(getApplicationContext(),"response submitted successfully",Toast.LENGTH_SHORT).show();
                            }
                        }
                });
                Button btn_reset=findViewById(R.id.button_reset);
                btn_reset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        rgender.clearCheck();
                    }
                });
            }
        });
    }
}