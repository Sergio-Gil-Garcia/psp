package com.sergio.intents.activity.instants.btoadcast.configuration.changes.ciclo.vida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("SergioGil", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("SergioGil", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("SergioGil", "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("SergioGil", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("SergioGil", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("SergioGil", "onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("SergioGil", "onStart");
    }
}