package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.app.FragmentManager fm = getFragmentManager();
        PopActivity popActivity = new PopActivity();
        popActivity.show(fm,"hhh");
    }

    public void SetDate(String data) {
        TextView textView = findViewById(R.id.textView);
        textView.setText(data);
    }
}