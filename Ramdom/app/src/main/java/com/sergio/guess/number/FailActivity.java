package com.sergio.guess.number;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fail);

        Intent intent = getIntent();
        int inputNumber = intent.getIntExtra(MainActivity.INPUT_NUMBER, 0);
        int randomNumber = intent.getIntExtra(MainActivity.RANDOM_NUMBER, 0);
        TextView result = findViewById(R.id.result);
        result.setText(String.format("Has perdido tenias que adivinar %d y has puesto %d", randomNumber, inputNumber));
    }
}
