package com.bcmc.practice10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        String name = getIntent().getStringExtra("NAME");
        setTitle(name+ "'s profile");
        Toast.makeText(profile.this, "user name is: "+name, Toast.LENGTH_SHORT).show();


    }
}
