package com.example.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

/*public class test_results extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("SavedInstanceState", "before the if of savedInstance State");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_results);
    }
}*/

public class test_results extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.test_results,container,false);
        TextView cbc=view.findViewById(R.id.cbc_result);
        cbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image_cbc=view.findViewById(R.id.imageView);
                image_cbc.setImageResource(R.drawable.cbc);
            }
        });
        //super.onCreateView(inflater, container, savedInstanceState);
    return view;
    }
}
