package com.example.anni.sp_exe23;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements Harjoitus23Application.Harjoitus23Interface {

    Harjoitus23Application harjoitus23Application = new Harjoitus23Application();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void threadProgressing(final String message) {

        Log.d("tag1", "message");

        runOnUiThread(new Runnable() {
            public void run() {
                TextView textView = findViewById(R.id.textView1);
                textView.setText(message);
            }
        });
    }
        public void send(View view) {
            //String Url = editText.getText().toString();
            Log.d("tag1", "send");
            harjoitus23Application.listener = this;
            harjoitus23Application.start();

        }
        public void stop(View view) {
            Log.d("tag2", "stop");
            harjoitus23Application.interrupt();

        }
}