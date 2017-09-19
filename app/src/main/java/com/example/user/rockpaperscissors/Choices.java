package com.example.user.rockpaperscissors;

import java.util.ArrayList;

/**
 * Created by user on 19/09/2017.
 */

public class Choices {
    private ArrayList<String> choices;

    public Choices() {
        choices = new ArrayList<>();
    }

    public Choices(ArrayList<String> customChoices) {
        choices = new ArrayList<>(customChoices);
    }

    public ArrayList<String> getChoices() {
        return new ArrayList<>(choices);
    }

    public int getLength() {
        return choices.size();
    }

    public void setUpChoices() {
        String[] choicesToAdd = {
                "Rock",
                "Paper",
                "Scissors"
        };

        for(String choice: choicesToAdd) {
            this.choices.add(choice);
        }
    }

    public String getChoiceByIndex(int index) {
        return this.choices.get(index);
    }

    public String getRandomChoice(NumberGenerating numberGenerator) {
        int randomIndex = numberGenerator.generateNumber(getLength());
        String randomChoice = getChoiceByIndex(randomIndex);
        return randomChoice;
    }

    public String getUserChoice(int userInput){
        String userChoice = getChoiceByIndex(userInput);
        return userChoice;
    }


}
