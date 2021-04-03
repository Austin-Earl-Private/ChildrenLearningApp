package edu.byui.childrenlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        info.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });

    }

    public void colorBlack(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_black);
        colorSound.start();
        colorSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void colorWhite(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_white);
        colorSound.start();
        colorSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void colorBlue(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_blue);
        colorSound.start();
        colorSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void colorRed(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_red);
        colorSound.start();
        colorSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void colorOrange(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_orange);
        colorSound.start();
        colorSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void colorBrown(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_brown);
        colorSound.start();
        colorSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void colorYellow(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_yellow);
        colorSound.start();
        colorSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void colorPink(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_pink);
        colorSound.start();
        colorSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void colorGrey(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_grey);
        colorSound.start();
        colorSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void colorGreen(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_green);
        colorSound.start();
        colorSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void colorPurple(View btnColor) {
        MediaPlayer colorSound = MediaPlayer.create(this, R.raw.colors_purple);
        colorSound.start();
        colorSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void GoToMenu(View view) {
        Intent menuGame = new Intent(this, GameMenu.class);
        startActivity(menuGame);
    }
}