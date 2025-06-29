package com.example.pisti_hesapla;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_game);

        Intent intent = getIntent();
        String team1 = intent.getStringExtra("team1");
        String team2 = intent.getStringExtra("team2");

        TextView team1TextView = findViewById(R.id.textView7);
        TextView team2TextView = findViewById(R.id.textView8);

        team1TextView.setText(team1);
        team2TextView.setText(team2);


    }
}