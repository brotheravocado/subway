package com.example.slidingmenu;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import android.content.Intent;
//이혜주 : 즐겨찾기 화면 및 슬라이딩 화면
public class Menu extends AppCompatActivity implements OnEditorActionListener {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        // 전체화면인 DrawerLayout 객체 참조
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        // Drawer 화면(뷰) 객체 참조
        final View drawerView = (View) findViewById(R.id.drawer);

        //에딕트 텍스트로 얻은 지하철 역 데이터 값 비교
        final EditText stationsearch = (EditText)findViewById(R.id.stationsearch);

        ImageButton triangle = (ImageButton) findViewById(R.id.triangle);
        ImageButton hamburger = (ImageButton) findViewById(R.id.hamburger);
        final ImageButton arrivealarm = (ImageButton) findViewById(R.id.arrivealarm);
        stationsearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            // TODO : keypad 에서 enter 실행시 Listen하고 동작할 액션을 작성

            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {

                // 텍스트 내용을 가져온다.
                String searchData = textView.getText().toString();

                // 텍스트 내용이 비어있다면...
                if (searchData.isEmpty()) {

                    // 토스트 메세지를 띄우고, 창 내용을 비운다
                    final Toast toast1 = Toast.makeText(getApplicationContext(),"역 검색해라" ,Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.TOP, 0, 150);
                    toast1.show();

                    return true;
                }
                else if(searchData.equals("sasang")){
                    final Toast toast1 = Toast.makeText(getApplicationContext(),"검색한 역으로 이동" ,Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.TOP, 0, 150);
                    toast1.show();

                }
                else{
                    final Toast toast1 = Toast.makeText(getApplicationContext(),"검색한 역 존재하지 아늠" ,Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.TOP, 0, 150);
                    toast1.show();
                    textView.clearFocus();
                    textView.setFocusable(false);
                    textView.setText("");
                    textView.setFocusableInTouchMode(true);
                    textView.setFocusable(true);

                }

                // 텍스트 내용이 비어있지않다면
                switch (i) {

                    // Search 버튼일경우
                    case EditorInfo.IME_ACTION_SEARCH:

                        break;

                    // Enter 버튼일경우
                    default:

                        // TODO : Write Your Code

                        return false;
                }

                // 내용 비우고 다시 이벤트 할수있게 선택


                return true;

            }

        });

        /*
        stationsearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }
            @Override
            public void afterTextChanged(Editable s) {

                if(stationsearch.getText().toString().equals('s')){
                    final Toast toast1 = Toast.makeText(getApplicationContext(),"검색한 역으로 이동" ,Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.TOP, 0, 100);
                    toast1.show();
                }
                else{
                    final Toast toast2 = Toast.makeText(getApplicationContext(),"검색한 역이 존재하지 않습니다" ,Toast.LENGTH_SHORT);
                    toast2.setGravity(Gravity.TOP, 0, 100);
                    toast2.show();
                }
            }
        });
        */


        // 드로어 화면을 열고 닫을 버튼 객체 참조
        //Button btnOpenDrawer = (Button) findViewById(R.id.btn_OpenDrawer);
        //Button btnCloseDrawer = (Button) findViewById(R.id.btn_CloseDrawer);


        arrivealarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), Arrivealarm.class);
                startActivity(it);
            }
        });

        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(drawerView);
            }
        });

        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.closeDrawer(drawerView);
            }
        });

        // 드로어 여는 버튼 리스너
        /*
        btnOpenDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(drawerView);
            }
        });
         */

        // 드로어 닫는 버튼 리스너
        /*
        btnCloseDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.closeDrawer(drawerView);
            }
        });
         */
    }


    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        return false;
    }
}