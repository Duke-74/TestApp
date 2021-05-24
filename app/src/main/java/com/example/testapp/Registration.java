package com.example.testapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {

    Button userEnter, registrationBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

    }

    public void addListenerOnButton(){
        userEnter = (Button) findViewById(R.id.userEnter);
        registrationBack = (Button) findViewById(R.id.enterMain);

        userEnter.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.testapp.Authorization");
                    }
                }
        );

        registrationBack.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.testapp.MainActivity");
                    }
                }
        );
    }
}