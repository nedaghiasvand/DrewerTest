package com.xmlexample.win2.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String family = intent.getStringExtra("family");
        String age = intent.getStringExtra("age");
        String email = intent.getStringExtra("email");
        String mobile = intent.getStringExtra("mobile");
        TextView textView1= (TextView) findViewById(R.id.txtname);
        TextView textView2= (TextView) findViewById(R.id.txtfamily);
        TextView textView3= (TextView) findViewById(R.id.txtage);
        TextView textView4= (TextView) findViewById(R.id.txtemail);
        TextView textView5= (TextView) findViewById(R.id.txtmobile);
        textView1.setText(name);
        textView2.setText(family);
        textView3.setText(age);
        textView4.setText(email);
        textView5.setText(mobile);

    }
}
