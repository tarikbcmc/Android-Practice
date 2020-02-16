package com.bcmc.practice10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText username_et, password_et;
    CheckBox agree_cb;
    Button login_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("login");

        username_et = (EditText)findViewById(R.id.username_et);
        password_et = (EditText)findViewById(R.id.username_et);
        agree_cb = (CheckBox) findViewById(R.id.agree_cb);
        login_btn = (Button) findViewById(R.id.login_btn);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String UN = username_et.getText().toString();
                String pass = username_et.getText().toString();
                if (UN.equals("")){
                    username_et.setError("Please Enter Username");
                } else if (pass.equals("")){
                    username_et.setError("Please Enter Password");
                } else if (!agree_cb.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Plsease Check Agree Box", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(getApplicationContext(), "Login Successfully\nUsername: " + UN+"\nPassword:"+pass, Toast.LENGTH_SHORT).show();

                }
            }
        });
    }


//    public void LoginMe(View v) {
//        Toast.makeText(getApplicationContext(), "Click", Toast.LENGTH_LONG).show();
//
//    }
}
