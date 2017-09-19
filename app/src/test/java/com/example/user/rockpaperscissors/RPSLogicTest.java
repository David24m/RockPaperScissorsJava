package com.example.user.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 19/09/2017.
 */
public class RPSLogicTest {
    Choices choices;
    NumberGenerating numberGenerator;


    @Test
    public void canFindRockWins() {
        choices.setUpChoices();
        choices.getRandomChoice(numberGenerator);
        choices.getUserChoice(0);
        assertEquals("Rock Wins", RPSLogic.win());
    }



}