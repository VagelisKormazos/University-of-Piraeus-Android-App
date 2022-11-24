package com.unipi.kormazos.UnipiApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.Btn1);
        button2 = findViewById(R.id.Btn2);
        button3 = findViewById(R.id.Btn3);
        button4 = findViewById(R.id.Btn4);
    }
    public void Go1(View view){
            Intent intent = new Intent(this,MainActivity2.class);
            startActivity(intent);
    }

    public void Go2(View view){
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }

    public void Go3(View view){
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }

    public void Go4(View view){
        Intent intent = new Intent(this,MainActivity5.class);
        startActivity(intent);
    }

}