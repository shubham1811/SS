package com.example.ctutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText et1, et2;
    Button bt;

    int j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.editText);
        et2 = findViewById(R.id.editText2);
        bt = findViewById(R.id.button);
        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name = et1.getText().toString();
        String pass = et2.getText().toString();
         if(name.isEmpty())
         {
             Toast.makeText(MainActivity.this,"Please Enter Name",Toast.LENGTH_SHORT).show();
         }
         else if(pass.isEmpty())
         {
             Toast.makeText(MainActivity.this,"Please Enter Password",Toast.LENGTH_SHORT).show();
         }
         else {
             Intent i = new Intent(this, LoginResultActivity.class);
             i.putExtra("N", name);
             i.putExtra("P", pass);
             startActivity(i);
         }

    }
}