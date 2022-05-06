package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    public void setPreference(View view) {
        EditText et = findViewById(R.id.nameInput);
        String name = et.getText().toString();
        SharedPreferences myShared = this.getSharedPreferences(String.valueOf(R.string.myPreferences), Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = myShared.edit();
        editor.putString(String.valueOf(R.string.mySharedText), name);
        editor.apply();
    }
}