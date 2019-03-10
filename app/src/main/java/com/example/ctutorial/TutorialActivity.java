package com.example.ctutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TutorialActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        b1 = findViewById(R.id.button6);
        b2 = findViewById(R.id.button7);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==b1)
        {
            Intent i = new Intent(this,SyntaxActivity.class);
            startActivity(i);
        }
        if (v==b2)
        {
            Intent i = new Intent(this,ProgrammeActivity.class);
            startActivity(i);
        }
    }
}
