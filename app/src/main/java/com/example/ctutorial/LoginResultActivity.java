package com.example.ctutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginResultActivity extends AppCompatActivity implements View.OnClickListener {
TextView tv;
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_result);
        tv = findViewById(R.id.textView2);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        Bundle b = getIntent().getExtras();
        String name = b.getString("N");
        String pass = b.getString("P");
        tv.setText("Hello...."+name);


    }

    @Override
    public void onClick(View v) {
        if(v==b1)
        {
            Intent i = new Intent(this,TutorialActivity.class);
            startActivity(i);
        }
        if(v==b2)
        {
            Intent i = new Intent(this,PractiseActivity.class);
            startActivity(i);
        }
    }
}
