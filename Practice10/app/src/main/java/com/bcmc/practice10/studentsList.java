package com.bcmc.practice10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class studentsList extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_list);
        listView =(ListView)findViewById(R.id.student_lv_id);
        final String[] name={"Rohim","Korim","Jobbar","Sabbair","Nazmul","Rokon"};

        ArrayAdapter adapter = new ArrayAdapter(studentsList.this,R.layout.list_view_style,R.id.LV_text_id,name);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
//                Toast.makeText(studentsList.this, l+"--"+pos, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),profile.class);
                intent.putExtra("NAME",""+name[pos]);
                startActivity(intent);
            }
        });
    }
}
