package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class my_dialogfragment extends AppCompatDialogFragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_fragment, container, false);
        Button logbtn = view.findViewById(R.id.login);
        EditText user_name=view.findViewById(R.id.User_name);
        logbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle=new Bundle();
                bundle.putString("name_input",user_name.getText().toString());

                Fragment fragment=new first_fragment();
                fragment.setArguments(bundle);
                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.frame_fragment,fragment);
                //fragmentTransaction.replace(R.id.frame_fragment,fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                //String name_input=user_name.getText().toString();

                dismiss();

                //MainActivity fragment=new MainActivity();
                //fragment.getSupportFragmentManager().beginTransaction().add(R.id.frame_fragment,first_fragment.class,null).commit();
                //getSupportFragmentManager().beginTransaction()
                 //       .replace(R.id.frame_fragment, my_dialogfragment.class,null).commit();
                //Intent intent=new Intent(my_dialogfragment.this,first_fragment.class);
                //startActivity(intent);
            }
        });

        return view;
        //View view=inflater.inflate(R.layout.fragment_p, container, false);
    }
}
