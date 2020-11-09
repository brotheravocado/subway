

// 윤지 아이디 비번 찾기 첫 화면
package com.example.a1t;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;

public class Find extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find);
    }

    public void back(View v){

        Intent it = new Intent(getApplicationContext(), Login.class);
        startActivity(it);

    }
    public void id_find(View v){
        Intent it = new Intent(getApplicationContext(), Find_id.class);
        startActivity(it);
    }
    public void passwd_find(View v){
        Intent it = new Intent(getApplicationContext(), Find_passwd.class);
        startActivity(it);

    }
}

