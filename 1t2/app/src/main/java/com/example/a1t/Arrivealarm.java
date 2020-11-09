package com.example.a1t;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

//이혜주 : 알람 목록
public class Arrivealarm extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arrivealarm);


        ImageButton before = (ImageButton) findViewById(R.id.before);
        before.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), Menu.class);
                startActivity(it);
            }
        });



        CheckBox checkBox = (CheckBox) findViewById(R.id.check1);
        checkBox.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });


        Switch sw = (Switch) findViewById(R.id.onoff);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getApplicationContext(),"Alarm On", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Alarm Off", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}