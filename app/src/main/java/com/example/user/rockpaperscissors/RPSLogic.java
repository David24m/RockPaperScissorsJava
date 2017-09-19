package com.example.user.rockpaperscissors;

/**
 * Created by user on 19/09/2017.
 */


public class RPSLogic {

//    Choices choices;
//    NumberGenerating numberGenerator;

    public String win(String userChoice, String aiChoice) {
        if (userChoice.equals("Rock") && aiChoice.equals("Scissors")) {

            return "Rock wins";
        } else if (userChoice.equals("Rock") && aiChoice.equals("Paper")) {

            return "Paper wins";
        } else if (userChoice.equals("Rock") && aiChoice.equals("Rock")) {

            return "It's a tie!";
        } else if (userChoice.equals("Paper") && aiChoice.equals("Rock")) {

            return "Paper wins";
        } else if (userChoice.equals("Paper") && aiChoice.equals("Paper")) {

            return "It's a tie!";
        } else if (userChoice.equals("Paper") && aiChoice.equals("Scissors")) {

            return "Scissors wins";
        } else if (userChoice.equals("Scissors") && aiChoice.equals("Rock")) {

            return "Rock wins";
        } else if (userChoice.equals("Scissors") && aiChoice.equals("Paper")) {

            return "Scissors wins";
        } else if (userChoice.equals("Scissors") && aiChoice.equals("Scissors")) {

            return "It's a tie!";
        }
        return "Your game is broken";
    }
}

