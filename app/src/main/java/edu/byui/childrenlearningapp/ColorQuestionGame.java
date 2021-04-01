package edu.byui.childrenlearningapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

import edu.byui.childrenlearningapp.Factories.ColorFactory;
import edu.byui.childrenlearningapp.Models.A_Color;

public class ColorQuestionGame extends AppCompatActivity {
    private A_Color selectedAnswer;
    private ArrayList<A_Color> wrongAnswers = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<String> colorsList = ColorFactory.getAllPossibleColors();
        Random rand =  new Random();
        selectedAnswer = ColorFactory.getColor(colorsList.get(rand.nextInt(colorsList.size())),this,true);
        assert selectedAnswer != null;
        colorsList.remove(selectedAnswer.getColorName());
        wrongAnswers.add(ColorFactory.getColor(colorsList.get(rand.nextInt(colorsList.size())),this,false));
        wrongAnswers.add(ColorFactory.getColor(colorsList.get(rand.nextInt(colorsList.size())),this,false));






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
    public void numberEleven(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_eleven);
        numberSound.start();
    }
    public void numberTwelve(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twelve);
        numberSound.start();
    }
    public void numberThirteen(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_thirteen);
        numberSound.start();
    }
    public void numberFourteen(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_fourteen);
        numberSound.start();
    }
    public void numberFifteen(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_fifteen);
        numberSound.start();
    }
    public void numberSixteen(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_sixteen);
        numberSound.start();
    }
    public void numberSeventeen(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_seventeen);
        numberSound.start();
    }
    public void numberEighteen(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_eighteen);
        numberSound.start();
    }
    public void numberNineteen(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_nineteen);
        numberSound.start();
    }
    public void numberTwenty(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twenty);
        numberSound.start();
    }
    public void numberTwentyone(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twentyone);
        numberSound.start();
    }
    public void numberTwentytwo(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twentytwo);
        numberSound.start();
    }
    public void numberTwentythree(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twentythree);
        numberSound.start();
    }
    public void numberTwentyfour(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twentyfour);
        numberSound.start();
    }
    public void numberTwentyfive(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twentyfive);
        numberSound.start();
    }
    public void numberTwentysix(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twentysix);
        numberSound.start();
    }
    public void numberTwentyseven(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twentyseven);
        numberSound.start();
    }
    public void numberTwentyeight(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twentyeight);
        numberSound.start();
    }
    public void numberTwentynine(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twentynine);
        numberSound.start();
    }
    public void numberThirty(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_thirty);
        numberSound.start();
    }


    public void GoToMenu(View view) {
        Intent menuGame = new Intent(this, GameMenu.class);
        startActivity(menuGame);
    }
}
