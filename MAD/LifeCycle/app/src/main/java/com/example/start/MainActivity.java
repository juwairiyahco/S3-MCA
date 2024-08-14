package com.example.start;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("state","created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("state","starting");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("state","resuming");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("state","paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("state","stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("state","restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("state","destroyed");
    }
}