package com.example.randomfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class frndActivity extends AppCompatActivity {
    private TextView printMe;
    Context context;
    public void ClassB(Context context){
        this.context=context;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frnd);
        Intent receive = getIntent();
        String friend = receive.getStringExtra("EXTRA");
        printMe = (TextView) ((Activity)context).findViewById(R.id.text);
        printMe.setText(friend);
    }
}