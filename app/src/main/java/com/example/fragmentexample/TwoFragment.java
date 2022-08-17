package com.example.fragmentexample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.content.Intent.getIntent;


public class TwoFragment extends Fragment {
    TextView sname,sdob,sgender;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_two, container, false);

        sname=view.findViewById(R.id.saveName);
        sdob=view.findViewById(R.id.savedob);
        sgender=view.findViewById(R.id.savegender);

       Bundle bundle = this.getArguments();

        String name = bundle.getString("NAME");
        String dateOfBirth = bundle.getString("DOB");
        String gender = bundle .getString("GENDER");




        sname.setText("Name: "+ name);
        sdob.setText("Selected Date: "+ dateOfBirth);
        sgender.setText("Gender Is: "+ gender);

        return view;
    }
}