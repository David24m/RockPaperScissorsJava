package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RockPaperScissorsActivity extends AppCompatActivity {

    TextView requestText;
    Button rockButton;
    Button scissorsButton;
    Button paperButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissors);

        requestText = (TextView) findViewById(R.id.request_text);
        rockButton = (Button) findViewById(R.id.rock_button);
        scissorsButton = (Button) findViewById(R.id.scissors_button);
        paperButton = (Button) findViewById(R.id.paper_button);
    }

    public void setRockButtonClicked(View button) {
        Intent intent = new Intent(this, ChoiceActivity.class);

        intent.putExtra("playerChoice", "Rock");

        startActivity(intent);
    }

    public void setScissorsButtonClicked(View button) {
        Intent intent = new Intent(this, ChoiceActivity.class);

        intent.putExtra("playerChoice", "Scissors");

        startActivity(intent);
    }

    public void setPaperButtonClicked(View button) {
        Intent intent = new Intent(this, ChoiceActivity.class);

        intent.putExtra("playerChoice", "Paper");

        startActivity(intent);
    }
}
