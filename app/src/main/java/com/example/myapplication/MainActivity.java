package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        Button enter = (Button) findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText accountenter = (EditText) findViewById(R.id.accountenter);
                EditText passwordenter = (EditText) findViewById(R.id.passwordenter);
                String input = accountenter.getText().toString();
                String input1 = passwordenter.getText().toString();
                TextView message = (TextView) findViewById(R.id.message);
                message.setText("使用者"+ input + "已登入\n請稍後..." );
                Button entertext = (Button)findViewById(R.id.enter);
                entertext.setText("登出");
            }
        });

    }}