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
        assertEquals(numb1.getName(),"Austin");
    }

    @Test
    public void setName() {
        Numbers numb1 = new Numbers();
        numb1.setName("Austin");
        assertEquals(numb1.getName(),"Austin");
        numb1.setName("Iramar");
        assertEquals(numb1.getName(),"Iramar");

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