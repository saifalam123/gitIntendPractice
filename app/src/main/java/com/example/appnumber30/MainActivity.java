package com.example.appnumber30;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnSecondActivity = (Button)findViewById(R.id.btnSecondActivity);
        btnSecondActivity.setOnClickListener(this);
    }

    // Jab bhi intent pey kaam hoga tou aap ko implement View.OnClickListener ko call karna parega or issi tarah
    // abstract method ko call kar kay aap ko neche waale hissay main code karna parega.

    @Override
    public void onClick(View view) {
        Intent myintent = new Intent(); // Intent class helps to move from one activity to another activity
        myintent.setClass(this , SecondActivity.class);

        startActivity(myintent);
    }
}
