package com.example.ctutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    RadioGroup rg;
    RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8,rb9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    tv1 = findViewById(R.id.textView1);
    tv2 = findViewById(R.id.textView2);
    tv3 = findViewById(R.id.textView3);
       tv4 = findViewById(R.id.textView4);
        tv5 = findViewById(R.id.textView5);
        tv6= findViewById(R.id.textView6);
        rg= findViewById(R.id.rgp1);
        rb1= findViewById(R.id.radioButton1);
        rb2= findViewById(R.id.radioButton2);
        rb3= findViewById(R.id.radioButton3);
        rb4= findViewById(R.id.radioButton4);
        rb5= findViewById(R.id.radioButton5);
        rb6= findViewById(R.id.radioButton6);
        rb7= findViewById(R.id.radioButton7);
        rb8= findViewById(R.id.radioButton8);
        rb9= findViewById(R.id.radioButton9);
        rg.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

            if(checkedId==R.id.radioButton1)
            {
             tv2.setText("True");
            }
            else if (checkedId==R.id.radioButton6)
            {
                tv4.setText("True");
            }
            else if(checkedId==R.id.radioButton9)
            {
                tv6.setText("True");
            }

    }
}
