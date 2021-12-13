package com.sergio.guess.number;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String INPUT_NUMBER = "INPUT_NUMBER";
    public static final String RANDOM_NUMBER = "RANDOM_NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected  void onResume(){
        super.onResume();
        int randomNumber = (int) (Math.random() * 9);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                EditText inputNumberEditText = findViewById(R.id.inputNumber);
                int inputNumber = Integer.parseInt(inputNumberEditText.getText().toString());
                Intent intent = new Intent();

                if(randomNumber == inputNumber) {
                    intent.setClass(MainActivity.this, WinActivity.class);
                    intent.putExtra(INPUT_NUMBER, inputNumber);
                    startActivity(intent);
                }else {
                    intent.setClass(MainActivity.this, FailActivity.class);
                    intent.putExtra(INPUT_NUMBER, inputNumber);
                    intent.putExtra(RANDOM_NUMBER, randomNumber);
                    startActivity(intent);
                }

            }
        });
    }
}