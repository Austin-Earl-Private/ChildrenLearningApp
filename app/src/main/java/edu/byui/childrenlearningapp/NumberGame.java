package edu.byui.childrenlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class NumberGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_game_1_10);

        MediaPlayer info = MediaPlayer.create(this, R.raw.numbers_click_on_each_number_to_learn_how_to_say_it);
        info.start();
    }
    public void gameToTen(View btnNext){
        setContentView(R.layout.activity_number_game_1_10);
    }
    public void gameToTwenty(View btnNext){
        setContentView(R.layout.activity_number_game_11_20);
    }

    public void gameToThirty(View btnNext){
        setContentView(R.layout.activity_number_game_21_30);
    }

    public void numberOne(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_one);
        numberSound.start();
    }

    public void numberTwo(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_two);
        numberSound.start();
    }

    public void numberThree(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_three);
        numberSound.start();
    }

    public void numberFour(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_foure);
        numberSound.start();
    }

    public void numberFive(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_five);
        numberSound.start();
    }

    public void numberSix(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_six);
        numberSound.start();
    }

    public void numberSeven(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_seven);
        numberSound.start();
    }

    public void numberEight(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_eight);
        numberSound.start();
    }
    public void numberNine(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_nine);
        numberSound.start();
    }
    public void numberTen(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_ten);
        numberSound.start();
    }

    public void GoToMenu(View view) {
        Intent menuGame = new Intent(this, GameMenu.class);
        startActivity(menuGame);
    }
}