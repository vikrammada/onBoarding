package com.example.check_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
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
                setContentView(R.layout.check_main);
                Button btnReset=findViewById(R.id.button_reset);
                Button btnSubmit=findViewById(R.id.button_submit);
                CheckBox check_c=findViewById(R.id.checkBox_c);
                CheckBox check_cpp=findViewById(R.id.checkBox_cpp);
                CheckBox check_java=findViewById(R.id.checkBox_Java);
                CheckBox check_pyn=findViewById(R.id.checkBox_python);
                CheckBox check_kotlin=findViewById(R.id.checkBox_kotlin);
                btnSubmit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(!check_c.isChecked()&&!check_cpp.isChecked()&&!check_java.isChecked()&&!check_pyn.isChecked()&&!check_kotlin.isChecked()){
                            Toast.makeText(getApplicationContext(),"you have not selected any language",Toast.LENGTH_SHORT).show();

                            //Toast.makeText(getApplicationContext(),"you have not selected any language",Toast.LENGTH_SHORT).show();

                        }else{
                            setContentView(R.layout.message_main);

                           // setContentView(R.layout.message_main);

                        }
                    }
                });
                btnReset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(check_c.isChecked()){
                            check_c.setChecked(false);
                        }
                        if(check_cpp.isChecked()){
                            check_cpp.setChecked(false);
                        }
                        if(check_java.isChecked()){
                            check_java.setChecked(false);
                        }
                        if(check_pyn.isChecked()){
                            check_pyn.setChecked(false);
                        }
                        if(check_kotlin.isChecked()){
                            check_kotlin.setChecked(false);
                        }

                    }
                });
            }
        });
    }
}