package com.example.friendapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FriendActivity extends AppCompatActivity {
    private TextView printMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend);
        Intent receive = getIntent();
        String friend = receive.getStringExtra("EXTRA");
        printMe = (TextView) findViewById(R.id.ans_btn);
        printMe.setText(friend);

    }

    @Override
    protected void onStop() {
        super.onStop();
        Intent back = new Intent(FriendActivity.this, MainActivity.class);
        startActivity(back);
    }
}