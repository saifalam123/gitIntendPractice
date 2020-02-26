package com.example.appnumber30;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity  {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity); // Iska matlab yeh hai kay iss class pey kaun si activity chalegi.
    }
}
// Every xml file needs a class to be run , just like activity_main needs main activity class just like that
// second activity needs this class to be run.

// Her XML file kay liye ek class banani zarori hai jahan pey hum yeh btayenge kay yahan pey kaun si activity.xml run hogi.
//For example  setContentView(R.layout.second_activity); iss line main hum ne btaya kay yeh SecondActivity class jo hai wo second_activity kay liye banai hai.
