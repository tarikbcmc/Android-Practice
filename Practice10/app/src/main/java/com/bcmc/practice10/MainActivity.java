package com.bcmc.practice10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login_btn;
    EditText search_et;
    TextView searach_res_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.nationsong);
        try {
            mp.start();
        }catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_SHORT).show();
        }

        login_btn =(Button)findViewById(R.id.login_btn);
        search_et =(EditText) findViewById(R.id.Search_ET);
        searach_res_tv =(TextView) findViewById(R.id.Search_Res_TV);


        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"Click-",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
            }
        });


//       click registration button
        findViewById(R.id.reg_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,Registration.class));

                Intent i = new Intent(MainActivity.this,Registration.class);
                startActivity(i);
            }
        });

//       click mcq button
        findViewById(R.id.mcq_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,Registration.class));

                Intent i = new Intent(MainActivity.this,mcq.class);
                startActivity(i);
            }
        });
//       click listView button
        findViewById(R.id.list_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,Registration.class));

                Intent i = new Intent(MainActivity.this,studentsList.class);
                startActivity(i);
            }
        });
//       click webview button
        findViewById(R.id.webView_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,Registration.class));

                Intent i = new Intent(MainActivity.this,webView.class);
                startActivity(i);
            }
        });

//        This code for get text from textView Automatically
        search_et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                searach_res_tv.setText(""+s);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

}
