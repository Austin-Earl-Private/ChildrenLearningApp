package edu.byui.childrenlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class ColorGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_game);

        MediaPlayer info = MediaPlayer.create(this,R.raw.colors_its_time_to_learn_about_colors);
        info.start();

    }

    public void colorBlack(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_black);
        colorSound.start();
    }
    public void colorWhite(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_white);
        colorSound.start();
    }
    public void colorBlue(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_blue);
        colorSound.start();
    }
    public void colorRed(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_red);
        colorSound.start();
    }
    public void colorOrange(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_orange);
        colorSound.start();
    }
    public void colorBrown(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_brown);
        colorSound.start();
    }
    public void colorYellow(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_yellow);
        colorSound.start();
    }
    public void colorPink(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_pink);
        colorSound.start();
    }
    public void colorGrey(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_grey);
        colorSound.start();
    }
    public void colorGreen(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_green);
        colorSound.start();
    }
    public void colorPurple(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_purple);
        colorSound.start();
    }
}