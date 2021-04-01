package edu.byui.childrenlearningapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

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
        Log.d("List",colorsList.toString());
        String selectedColor = colorsList.get(rand.nextInt(colorsList.size()));
        selectedAnswer = ColorFactory.getColor(selectedColor,this,true);

        Log.d("color", "onCreate: selected color"+selectedColor +"  "+ "selected anwser "+selectedAnswer);
        assert selectedAnswer != null;
        colorsList.remove(selectedAnswer.getColorName());
        wrongAnswers.add(ColorFactory.getColor(colorsList.get(rand.nextInt(colorsList.size())),this,false));
        wrongAnswers.add(ColorFactory.getColor(colorsList.get(rand.nextInt(colorsList.size())),this,false));
        Log.d("wrong anwswers ",wrongAnswers.toString());






        setContentView(R.layout.activity_color_question_game);

        MediaPlayer info = MediaPlayer.create(this, R.raw.numbers_click_on_each_number_to_learn_how_to_say_it);
        MediaPlayer color = MediaPlayer.create(this, selectedAnswer.getColorSoundRef());
        info.start();
        info.setNextMediaPlayer(color);

        ImageButton button1 = findViewById(R.id.answer1);
        ImageButton button2 = findViewById(R.id.answer2);
        ImageButton button3 = findViewById(R.id.answer3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedAnswer.playCorrectSound();

            }
        });
        button1.setImageResource(selectedAnswer.getColorImageRef());
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wrongAnswers.get(0).playWrongSound();
            }
        });
        button2.setImageResource(wrongAnswers.get(0).getColorImageRef());


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wrongAnswers.get(1).playWrongSound();
            }
        });
        button3.setImageResource(wrongAnswers.get(1).getColorImageRef());

    }



    public void GoToMenu(View view) {
        Intent menuGame = new Intent(this, GameMenu.class);
        startActivity(menuGame);
    }
}
