package com.example.ctutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProgrammeActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3,b4,b5,b6;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programme);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        tv=findViewById(R.id.textView);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==b1)
        {
         tv.setText("#include<stdio.h>\n" +
                 "int main()\n" +
                 "{\n" +
                 " int a,b,c;\n" +
                 " printf(\"Enter first number\\n\");\n" +
                 " scanf(\"%d\",&a);\n" +
                 " printf(\"Enter second number\\n\");\n" +
                 " scanf(\"%d\",&b);\n" +
                 " c=a+b;\n" +
                 " printf(\"Add=%d\",c);\n" +
                 " \t\n" +
                 "}");
        }
        if(v==b2)
        {
            tv.setText("#include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "\tfloat p,c,m,h,e,avg;\n" +
                    "\tprintf(\"Enter marks in physics \\n\");\n" +
                    "\tscanf(\"%f\",&p);\n" +
                    "\tprintf(\"Enter marks in chemistry \\n\");\n" +
                    "\tscanf(\"%f\",&c);\n" +
                    "\tprintf(\"Enter marks in math \\n\");\n" +
                    "\tscanf(\"%f\",&m);\n" +
                    "\tprintf(\"Enter marks in hindi \\n\");\n" +
                    "\tscanf(\"%f\",&h);\n" +
                    "\tprintf(\"Enter marks in english \\n\");\n" +
                    "\tscanf(\"%f\",&e);\n" +
                    "\tavg=(p+c+m+h+e)/5;\n"
            );
        }
        if(v==b3)
        {
            tv.setText("#include<stdio.h>\n" +
                    "void area(float radius)\n" +
                    "{\n" +
                    "\tfloat ar=3.14*radius*radius;\n" +
                    "\tprintf(\"Area of circle=%f\",ar);\n" +
                    "}\n" +
                    "int main()\n" +
                    "{\n" +
                    "float r;\n" +
                    "\tprintf(\"Enter radius of circle=\");\n" +
                    "\tscanf(\"%f\",&r);\n" +
                    "    area(r);\n" +
                    "}");
        }
        if(v==b4)
        {
            tv.setText("#include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    " int area,side;\n" +
                    " printf(\"Enter side of square\\n\");\n" +
                    " scanf(\"%d\",&h);\n" +
                    " area=side*side;\n" +
                    " printf(\"Area of square=%d\",area); \t\n" +
                    "}");
        }
        if(v==b5)
        {
            tv.setText("#include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    " float a,b,c;\n" +
                    " printf(\"Enter first number\\n\");\n" +
                    " scanf(\"%f\",&a);\n" +
                    " printf(\"Enter second number\\n\");\n" +
                    " scanf(\"%f\",&b);\n" +
                    " c=a/b;\n" +
                    " printf(\"Div=%d\",c);\n" +
                    " \t\n" +
                    "}");
        }
        if(v==b6)
        {
            tv.setText("#include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "\tfloat p,r,t,si;\n" +
                    "\tprintf(\"Enter principle\\n\");\n" +
                    "\tscanf(\"%f\",&p);\n" +
                    "\tprintf(\"Enter rate of interest \\n\");\n" +
                    "\tscanf(\"%f\",&r);\t\n" +
                    "\tprintf(\"Enter time \\n\");\n" +
                    "\tscanf(\"%f\",&t);\n" +
                    "\tsi=(p*r*t)/100;\n" +
                    "\tprintf(\"Simple Interest=%f\",si);\n" +
                    "}");
        }
    }
}
