package com.example.ctutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PractiseActivity extends AppCompatActivity {
    TextView tv1,tv2;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practise);
        b=findViewById(R.id.button4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuiz();

            }
        });
    }
    private void startQuiz(){
        Intent intent=new Intent(this,QuizActivity.class);
        startActivity(intent);
    }

}
