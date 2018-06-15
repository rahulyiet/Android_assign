package com.example.rahulkumar.loginform;

import android.app.UiAutomation;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity{

   Toast toast;
   Button myNewButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       myNewButton = findViewById(R.id.button);
        setContentView(R.layout.activity_main3);


    }


    public void display(View view) {
        Intent intent = new Intent(Main3Activity.this,Main3Activity.class);
        startActivity(intent);
    }
}



