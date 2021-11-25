package com.sergio.suma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = findViewById(R.id.add_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText firstNumberEditText = findViewById(R.id.first_number);
                EditText secondNumberEditText = findViewById(R.id.second_number);

                int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
                int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());

                TextView resultTextView = findViewById(R.id.result);
                resultTextView.setText(String.format("%d", firstNumber + secondNumber));
            }
        });
    }

}