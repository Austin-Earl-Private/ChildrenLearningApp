package edu.byui.childrenlearningapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {



    @Test
    public void getName() {
        Numbers numb1 = new Numbers();
        numb1.setName("Austin");
        assertEquals("Austin",numb1.getName());
    }

    @Test
    public void setName() {
        Numbers numb1 = new Numbers();
        numb1.setName("Austin");
        assertEquals("Austin",numb1.getName());
        numb1.setName("Iramar");
        assertEquals("Iramar",numb1.getName());

    }

    @Test
    public void playSound() {

    }

    @Test
    public void verifySoundFileExists() {

    }

    @Test
    public void onCreateDisplay() {
    }

    @Test
    public void onPress() {
    }
}