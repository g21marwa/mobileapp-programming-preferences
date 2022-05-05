package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tv = findViewById(R.id.isWorkingText);
        SharedPreferences myShared = this.getSharedPreferences(String.valueOf(R.string.myPreferences), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = myShared.edit();
        editor.putString(String.valueOf(R.string.mySharedText), "it's working");
        editor.apply();
    }
}