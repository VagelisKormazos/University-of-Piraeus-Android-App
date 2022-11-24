package com.unipi.kormazos.UnipiApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button = findViewById(R.id.BtnF2);
    }

    public void GoBack3(View View){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}