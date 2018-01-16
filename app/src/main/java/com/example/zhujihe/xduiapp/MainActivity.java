package com.example.zhujihe.xduiapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    public static final String logseTag = "111";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        printLog();
       logseTag.matches("\\d.\\-.*");
    }

    private void printLog() {
        Log.e(logseTag, "onCreate: ");
        Log.d(logseTag, "printLog:");
        if (1 > 0) {
            Log.d(logseTag, "printLog:");
        } else {
        }
        Log.d(logseTag, "printLog:");
        do {
            Log.d(logseTag, "printLog:");
        } while (true);

    }
}
