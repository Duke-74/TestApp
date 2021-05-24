package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button enterButton, authorizationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addListenerOnButton(){
        authorizationButton = (Button) findViewById(R.id.authorization);
        enterButton = (Button) findViewById(R.id.enterMain);

        authorizationButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.testapp.Registration");
                    }
                }
        );

        enterButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.testapp.Authorization");
                    }
                }
        );
    }

    @Override
    public void onClick(View v) {

    }
}