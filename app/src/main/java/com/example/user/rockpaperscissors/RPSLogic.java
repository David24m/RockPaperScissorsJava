package com.example.user.rockpaperscissors;

/**
 * Created by user on 19/09/2017.
 */


public class RPSLogic {

    Choices choices;
    NumberGenerating numberGenerator;

    public String win() {
        if (choices.getUserChoice(0).equals("Rock") && choices.getRandomChoice(numberGenerator).equals("Scissors")) {

            return "Rock wins";
        } else if (choices.getUserChoice(0).equals("Rock") && choices.getRandomChoice(numberGenerator).equals("Paper")) {

            return "Paper wins";
        } else if (choices.getUserChoice(0).equals("Rock") && choices.getRandomChoice(numberGenerator).equals("Rock")) {

            return "It's a tie!";
        } else if (choices.getUserChoice(1).equals("Paper") && choices.getRandomChoice(numberGenerator).equals("Rock")) {

            return "Paper wins";
        } else if (choices.getUserChoice(1).equals("Paper") && choices.getRandomChoice(numberGenerator).equals("Paper")) {

            return "It's a tie!";
        } else if (choices.getUserChoice(1).equals("Paper") && choices.getRandomChoice(numberGenerator).equals("Scissors")) {

            return "Scissors wins";
        } else if (choices.getUserChoice(2).equals("Scissors") && choices.getRandomChoice(numberGenerator).equals("Rock")) {

            return "Rock wins";
        } else if (choices.getUserChoice(2).equals("Scissors") && choices.getRandomChoice(numberGenerator).equals("Paper")) {

            return "Scissors wins";
        } else if (choices.getUserChoice(2).equals("Scissors") && choices.getRandomChoice(numberGenerator).equals("Scissors")) {

            return "It's a tie!";
        }
        return "Your game is broken";
    }
}

