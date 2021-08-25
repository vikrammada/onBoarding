package com.example.fragment;

import android.content.Intent;
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
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class first_fragment extends Fragment {

    Fragment fragment;
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
                fragment=new dialog_appointment();
                addFragment();
                //dialog_appointment appointment=new dialog_appointment();
                //appointment.show(getParentFragmentManager(),"appointment_dialog");
            }
        });
        testresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment=new test_results();
                addFragment();
                //Intent intent=new Intent(getActivity(),test_results.class);
                //startActivity(intent);
                //testresult.setImageResource(R.drawable.cbc);

            }
        });
        return view;
    }

    private void addFragment() {


        FragmentManager fragmentManager=getParentFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.test_results_view,fragment,"test_results_to_show");
        fragmentTransaction.addToBackStack("fragments");
        fragmentTransaction.commit();
    }
}
