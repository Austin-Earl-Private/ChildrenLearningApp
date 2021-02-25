package edu.byui.childrenlearningapp;

import org.junit.Test;

import static org.junit.Assert.*;

public class LettersTest {

    @Test
    public void getName() {
    }

    @Test
    public void getVowel() {
        Letters letter = new Letters();
        assertEquals(letter.getVowel(),false);
        letter.setVowel(true);
        assertEquals(letter.getVowel(),true);
    }

    @Test
    public void setName() {
    }

    @Test
    public void setVowel() {
    }

    @Test
    public void playSound() {
    }

    @Test
    public void onCreateDisplay() {
    }

    @Test
    public void onPress() {
    }
}