package com.sergio.guess.number;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WinActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        Intent intent = getIntent();
        int inputNumber = intent.getIntExtra(MainActivity.INPUT_NUMBER, 0);
        TextView result = findViewById(R.id.result);
        result.setText(String.format("Has adivinado el numero %d", inputNumber));
    }
}
