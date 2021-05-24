package com.example.testapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Authorization extends AppCompatActivity {

    Button authorization, authorizationBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);

    }

    public void addListenerOnButton(){
        authorization = (Button) findViewById(R.id.authorizationEnter);
        authorizationBack = (Button) findViewById(R.id.userEnterBack);

        authorization.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.testapp.userField");
                    }
                }
        );

        authorizationBack.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.testapp.MainActivity");
                    }
                }
        );
    }

}