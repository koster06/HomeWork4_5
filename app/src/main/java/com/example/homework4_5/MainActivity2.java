package com.example.homework4_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.d("testMsg", "onCreate");

        final Button btnStop = findViewById(R.id.button); //кнопками управляем активностями
        final Button btnResume = findViewById(R.id.button2);
        final Button btnDestr = findViewById(R.id.button4);

        btnResume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onResume();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onStop();
            }
        });

        btnDestr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDestroy();
            }
        });

    }
        @Override
        protected void onStart() {
            super.onStart();
            Log.d("testMsg", "onStart");
            Toast.makeText(this, "You are into onStart function", Toast.LENGTH_LONG).show();
        }
        @Override
        protected void onResume() {
            super.onResume();
            Log.d("testMsg", "onResume");
            Toast.makeText(this, "You are into onResume function", Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onPause() {
            super.onPause();
            Log.d("testMsg", "onPause");
            Toast.makeText(this, "You are into onPause function", Toast.LENGTH_LONG).show();
        }
        @Override
        protected void onStop() {
            super.onStop();
            Log.d("testMsg", "onStop");
            Toast.makeText(this, "You are into onStop function", Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onRestart() {
            super.onRestart();
            Log.d("testMsg", "onRestart");
            Toast.makeText(this, "You are into onRestart function", Toast.LENGTH_LONG).show();
        }
        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.d("testMsg", "onDestroy");
            Toast.makeText(this, "You are into onDestroy function", Toast.LENGTH_LONG).show();
        }
}