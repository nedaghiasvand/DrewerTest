package com.xmlexample.win2.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.btnnext);
        final EditText editText1 =(EditText) findViewById(R.id.edtname);
        final EditText editText2 =(EditText) findViewById(R.id.edtfamily);
        final EditText editText3 =(EditText) findViewById(R.id.edtage);
        final EditText editText4 =(EditText) findViewById(R.id.edtemail);
        final EditText editText5 =(EditText) findViewById(R.id.edtmobile);

button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
       String name = editText1.getText().toString();
        String family = editText2.getText().toString();
        String age = (editText3.getText().toString());
        String email = editText4.getText().toString();
        String mobile = (editText5.getText().toString());
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra("name",name);
        intent.putExtra("family",family);
        intent.putExtra("age",age);
        intent.putExtra("email",email);
        intent.putExtra("mobile",mobile);
        startActivity(intent);
    }
});

    }
}
