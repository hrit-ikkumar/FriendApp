package com.example.randomfriend;
import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mfrndBtn;
    String random_friend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String friends[] = {"Mudit", "Ravi", "Abhinandan", "Chain", "Hritik"};
        Random rand = new Random();
        int index = rand.nextInt(5);
        random_friend = friends[index];
`       mfrndBtn = findViewById(R.id.button);
        mfrndBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mAuth.signOut();
                sendUsertoFrnd();
            }
        });
    }
    void sendUsertoFrnd()
    {
        Intent frnd = new Intent(MainActivity.this, frndActivity.class);
        frnd.putExtra("EXTRA", random_friend);
        startActivity(frnd);
        finish();
    }

}