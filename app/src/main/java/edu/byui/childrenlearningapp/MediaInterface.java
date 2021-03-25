package edu.byui.childrenlearningapp;

import android.media.MediaPlayer;

public interface MediaInterface {

    MediaPlayer playSound(MediaPlayer sound);

    public void onCreateDisplay();
    public void onPress();
}
