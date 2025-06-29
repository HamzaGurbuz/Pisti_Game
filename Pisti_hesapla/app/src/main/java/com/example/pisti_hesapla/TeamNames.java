package com.example.pisti_hesapla;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class TeamNames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_team_names);

        EditText team1EditText = findViewById(R.id.editTextText);
        EditText team2EditText = findViewById(R.id.editTextText2);

        Button Start = findViewById(R.id.start);

        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String team1Name = team1EditText.getText().toString();
                String team2Name = team2EditText.getText().toString();

                Intent intent = new Intent(TeamNames.this, Game.class);
                intent.putExtra("team1", team1Name);
                intent.putExtra("team2", team2Name);
                startActivity(intent);
            }
        });
    }
}
