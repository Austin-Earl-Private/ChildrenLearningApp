package edu.byui.childrenlearningapp;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Letters implements MediaInterface {

    private String name;
    private Boolean vowel;
    private MediaPlayer sound;
    private int image;

    public String getName() {
        return name;
    }

    public Boolean getVowel() {
        return vowel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVowel(Boolean vowel) {
        this.vowel = vowel;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setSound(MediaPlayer sound) {
        this.sound = sound;
    }

    public MediaPlayer getSound() {
        return sound;
    }

    @Override
    public MediaPlayer playSound(MediaPlayer sound) {
        //Here will declare how to call the sound of the letter.
        return null;
    }

    @Override
    public void onCreateDisplay() {
        //Here we will declare how to display the image of the letter.
        //ImageView letterView =

    }

    @Override
    public void onPress() {
        //Here we will declare what happened when the kid tap the letter.
    }
}
