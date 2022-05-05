package com.example.project;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private SharedPreferences myShared;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tv = findViewById(R.id.sharedText);

    }
    public void startActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        myShared = getSharedPreferences(String.valueOf(R.string.myPreferences), Context.MODE_PRIVATE);
        String myText = myShared.getString(String.valueOf(R.string.mySharedText), "still nothing");
        tv.setText(myText);
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences.Editor editor = myShared.edit();
        editor.clear();
        editor.apply();
        Log.d("asd", "asd");
        tv.setText("Nothing again");
    }

}
