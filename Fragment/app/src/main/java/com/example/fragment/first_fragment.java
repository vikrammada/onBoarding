package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class first_fragment extends Fragment {

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.login_fragment,container,false);
        TextView name=view.findViewById(R.id.textView5);
        ImageView appoint=view.findViewById(R.id.appointment);
        ImageView testresult=view.findViewById(R.id.test_results);
        Bundle arguments=getArguments();

        String input_name=arguments.getString("name_input");
        name.setText(input_name);

        appoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog_appointment appointment=new dialog_appointment();
                appointment.show(getParentFragmentManager(),"appointment_dialog");
            }
        });
        testresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                testresult.setImageResource(R.drawable.cbc);
            }
        });
        return view;
    }
}
