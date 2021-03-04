package edu.byui.childrenlearningapp;

import org.junit.Test;

import static org.junit.Assert.*;

public class LettersTest {

    @Test
    public void getName() {
        Letters letter = new Letters();
        assertEquals(null, letter.getName());
        letter.setName("Frani");
        assertEquals("Frani",letter.getName());
    }

    @Test
    public void getVowel() {
        Letters letter = new Letters();
        assertEquals(false,letter.getVowel());
        letter.setVowel(true);
        assertEquals(true,letter.getVowel());
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