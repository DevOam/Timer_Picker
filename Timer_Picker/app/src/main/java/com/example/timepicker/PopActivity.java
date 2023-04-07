package com.example.timepicker;


import android.app.DialogFragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;

import com.example.timepicker.MainActivity;
import com.example.timepicker.R;


public class PopActivity extends DialogFragment implements View.OnClickListener {

    View view;
    TimePicker tp;
    Button buDome;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        view=inflater.inflate(R.layout.activity_pop,container,false);
        tp=(TimePicker)view.findViewById(R.id.tp1);
        buDome=(Button)view.findViewById(R.id.buDome);
        buDome.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        this.dismiss();
        String myTime= null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            myTime = tp.getHour()+":"+tp.getMinute();
        }
        MainActivity ma=(MainActivity)getActivity();
        ma.SetDate(myTime);
    }
}