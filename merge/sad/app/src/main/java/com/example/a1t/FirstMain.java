package com.example.a1t;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class FirstMain extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstmain);
    }
    public void displayLogin(View v){

        Intent it = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(it);


    }
}