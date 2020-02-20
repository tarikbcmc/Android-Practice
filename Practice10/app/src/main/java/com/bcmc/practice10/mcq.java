package com.bcmc.practice10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class mcq extends AppCompatActivity {
    TextView question_tv;
    RadioGroup radioGroup;
    RadioButton op1,op2,op3;
    int pos=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcq);

        final String[] q = {
                "What is Internet?",
                "What is CPU?",
                "Who is The owner of Apple Company?",
                "Who is The owner of Microsoft Company?"
        };
        final String[][] op = {
                {"International Network","Interconnected Netword","Inter Network"},
                {"Central Processing Unit","Control Processing Unit","Computer Processing Unit"},
                {"Steve Jobs","Bill Grats","Einstein"},
                {"Steve Jobs","Bill Grats","Einstein"}
        };
        final String[] ans = {
                "Interconnected Netword",
                "Central Processing Unit",
                "Steve Jobs",
                "Bill Grats"
        };


        question_tv = (TextView) findViewById(R.id.question_tv);
        radioGroup = (RadioGroup) findViewById(R.id.radio_group_id);


        //load first mcq
        question_tv.setText(""+questions(0,q));
        options(pos,op);

        findViewById(R.id.next_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pos<q.length-1){
                    pos++;
                }else{
                    Toast.makeText(mcq.this, "Finished", Toast.LENGTH_SHORT).show();
                }
                question_tv.setText(""+questions(pos,q));
                options(pos,op);

            }
        });


    }

    public static String questions(int pos, String[] q){
        return q[pos];
    }

    public void options(int pos, String[][] op){
         op1 = (RadioButton) findViewById(R.id.ans_op_1);
         op2 = (RadioButton) findViewById(R.id.ans_op_2);
         op3 = (RadioButton) findViewById(R.id.ans_op_3);
         op1.setText(""+op[pos][0]);
         op2.setText(""+op[pos][1]);
         op3.setText(""+op[pos][2]);

    }


}
