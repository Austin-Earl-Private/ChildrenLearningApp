package edu.byui.childrenlearningapp;

import android.media.MediaPlayer;

public class Shapes implements MediaInterface {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public MediaPlayer playSound(MediaPlayer sound) {
        //Here will declare how to call the sound of the name of the Shape.
        return null;
    }

    @Override
    public void onCreateDisplay() {
        //Here we will declare how to display the image of the Shape.
    }

    @Override
    public void onPress() {
        //Here we will declare what happened when the kid tap the Shape.
    }
}
