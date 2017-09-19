package com.example.user.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 19/09/2017.
 */
public class ChoicesTest {

    Choices choices;

    @Before
    public void before() {
        choices = new Choices();
    }

    @Test
    public void canGetChoices() throws Exception {
        assertNotNull(choices.getChoices());

    }

    @Test
    public void canSetUpChoices() throws Exception {
        choices.setUpChoices();
        assertEquals(3, choices.getLength());
    }

    @Test
    public void canGetChoiceByIndex() {
        choices.setUpChoices();

        String indexChoice = choices.getChoiceByIndex(0);

        assertEquals("Rock", indexChoice);
    }

}