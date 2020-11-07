package com.example.mobile_subway;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class FirstMain extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.FirstMain);
    }
    public void displayLogin(View v){

        Intent it = new Intent(getApplicationContext(), Find.class);
        startActivity(it);


    }
}