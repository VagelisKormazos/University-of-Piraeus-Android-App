package com.unipi.kormazos.UnipiApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = findViewById(R.id.BtnF1);

    }

    public void GoBack2(View View){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}