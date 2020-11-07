// 아이디 찾기 윤지 파일


package com.example.a1t;
import android.graphics.Color;
import android.os.Bundle;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.content.res.Resources;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;



import java.util.regex.Pattern;

import static android.widget.Toast.LENGTH_SHORT;

public class Find_id extends AppCompatActivity{
    Button buttonEvent;
    String sUsername;
    String sUserphonenumber;
    EditText usernameEditText;
    EditText userphoneEditText;
    int countname = 0;
    int countphone = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_id);
        usernameEditText = (EditText) findViewById(R.id.editTextName); // 이름 입력
        usernameEditText.addTextChangedListener(etTextWatcher);
        sUsername = usernameEditText.getText().toString();
        buttonEvent = (Button)findViewById(R.id.id_button);
        userphoneEditText = (EditText) findViewById(R.id.editTextPhone);
        userphoneEditText.addTextChangedListener(etTextphone);
        sUserphonenumber = userphoneEditText.getText().toString();

        findViewById(R.id.id_button).setOnClickListener(mClickListener); // 버튼
    }

    TextWatcher etTextWatcher = new TextWatcher(){
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s)
        {

            if (Pattern.matches("^[a-zA-Z]*$",s)){
                    countname = 1;
            }
            else{
                    countname = 0;

            }
            showbutton();

        }

    };

    TextWatcher etTextphone = new TextWatcher(){
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s)
        {

        if (Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$",s)){
                countphone =1;
            }
        else{
            countphone = 0;
        }
        showbutton();

        }

    };
    void showbutton(){

        if (countphone+countname >= 2){
            buttonEvent.setBackgroundColor(Color.rgb(93,176,117));
        }
        else{
            buttonEvent.setBackgroundColor(Color.rgb(247,247,247));
        }
    }
    Button.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            //이곳에 버튼 클릭시 일어날 일을 적습니다.
            if ((sUsername.matches("") || sUsername == null) && (sUserphonenumber.matches("") || sUserphonenumber == null)){
                Toast.makeText(getApplicationContext(), "You did not enter the username and phonenumber", LENGTH_SHORT).show();
                return;
            }
            else if (sUsername.matches("") || sUsername == null) {
                Toast.makeText(getApplicationContext(), "You did not enter a username", LENGTH_SHORT).show();
                return;
            }
            else if (sUserphonenumber.matches("") || sUserphonenumber == null){
                Toast.makeText(getApplicationContext(), "You did not enter a phonenumber", LENGTH_SHORT).show();
            }
            else{
                buttonEvent.setBackgroundColor(Color.TRANSPARENT);
            }
        }
    };
    public void back(View v){ // 뒤로 가기

        Intent it = new Intent(getApplicationContext(), Find.class);
        startActivity(it);


    }
}
