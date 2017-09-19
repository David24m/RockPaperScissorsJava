package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChoiceActivity extends AppCompatActivity {

    TextView playerChoiceText;
    TextView aiChoiceText;
    Choices choices;
    NumberGenerating randomNumberGenerator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        playerChoiceText = (TextView) findViewById(R.id.player_choice_text);
        aiChoiceText = (TextView) findViewById(R.id.ai_choice_text);

        randomNumberGenerator = new RandomNumberGenerator();

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String playersChoice = extras.getString("playerChoice");
        String aiChoice = choices.getRandomChoice(randomNumberGenerator);

        RPSLogic rpsLogic = new RPSLogic();
        String outputString = rpsLogic.win(playersChoice, aiChoice);


    }
}
