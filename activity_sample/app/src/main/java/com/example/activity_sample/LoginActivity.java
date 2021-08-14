package com.example.activity_sample;

import android.content.Intent;
import android.os.Bundle;
import android.os.strictmode.CredentialProtectedWhileLockedViolation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import java.net.URISyntaxException;

public class LoginActivity extends Fragment {

    @Override
    // protected void onCreate(Bundle savedInstanceState) {
    //   super.onCreate(savedInstanceState);
    // setContentView(R.layout.login_activity);
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.login_activity, container, false);
        View view=inflater.inflate(R.layout.login_activity, container, false);
        ImageView msg = view.findViewById(R.id.imageView);
        ImageView app = view.findViewById(R.id.imageView2);
        EditText login_str = view.findViewById(R.id.UserName_Login);
        /*Intent intent = null;
        try {
            intent = Intent.getIntentOld("user_name");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        String str = intent.getStringExtra("user_name");
        login_str.setText(str);*/
        /*app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AppointmnetActivity.class);
                startActivity(intent);
                setContentView(R.layout.appointment_activity);
            }
        });*/
        return view;
    }
}
