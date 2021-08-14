package com.example.fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("SavedInstanceState","before the if of savedInstance State");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.button);
        Button diabtn=findViewById(R.id.button2);
        diabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this, SignupActivity.class);
                startActivity(intent);

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_dialogfragment login=new my_dialogfragment();
                login.show(getSupportFragmentManager(),"Loginfragment");
            }
        });
        /*if (savedInstanceState == null) {
            Log.d("SavedInstanceState","inside the if of savedInstance State");
            Log.i("SavedInstanceState","inside the if of savedInstance State");
             getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame_fragment,frag_act.class,null).commit();
            Log.i("SavedInstanceState","after the fragment manager");

        }*/

    }
}