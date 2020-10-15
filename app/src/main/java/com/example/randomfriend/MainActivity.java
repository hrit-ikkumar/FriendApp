package com.example.randomfriend;
import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String friends[] = {"Mudit", "Ravi", "Abhinandan", "Chain", "Hritik"};
        Random rand = new Random();
        int index = rand.nextInt(5);
        String random_friend = friends[index];
    }
}