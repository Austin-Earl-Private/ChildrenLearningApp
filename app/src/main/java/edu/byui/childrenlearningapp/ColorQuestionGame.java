package edu.byui.childrenlearningapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

import edu.byui.childrenlearningapp.Factories.AnimalFactory;
import edu.byui.childrenlearningapp.Factories.ColorFactory;
import edu.byui.childrenlearningapp.Models.A_Color;
import edu.byui.childrenlearningapp.Models.Color;

public class ColorQuestionGame extends AppCompatActivity {
    private A_Color selectedAnswer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_color_question_game);
        runGame();

        ImageButton repeat = findViewById(R.id.btnSpeaker);

        repeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer color = MediaPlayer.create(ColorQuestionGame.this, selectedAnswer.getColorSoundRef());
                color.start();
                color.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.stop();
                        mediaPlayer.release();
                    }
                });
            }
        });

    }



    public void GoToMenu(View view) {
        Intent extraMenu = new Intent(this, ExtraGameMenu.class);
        startActivity(extraMenu);
    }

    private void runGame(){

        ArrayList<A_Color> wrongAnswers = new ArrayList<>();
        ArrayList<String> colorsList = ColorFactory.getAllPossibleColors();
        Random rand =  new Random();
        Log.d("List",colorsList.toString());
        String selectedColor = colorsList.get(rand.nextInt(colorsList.size()));
        selectedAnswer = ColorFactory.getColor(selectedColor,this,true);

        Log.d("color", "onCreate: selected color"+selectedColor +"  "+ "selected answer "+selectedAnswer);
        assert selectedAnswer != null;
        colorsList.remove(selectedAnswer.getColorName());
        wrongAnswers.add(ColorFactory.getColor(colorsList.get(rand.nextInt(colorsList.size())),this,false));

        wrongAnswers.add(ColorFactory.getColor(colorsList.get(rand.nextInt(colorsList.size())),this,false));
        while(wrongAnswers.get(0).getColorName().equals(wrongAnswers.get(1).getColorName())){
            Log.d("Repeated wrong answers: ", wrongAnswers.toString());
            wrongAnswers.remove(1);
            wrongAnswers.add(ColorFactory.getColor(colorsList.get(rand.nextInt(colorsList.size())),this,false));
            Log.d("Changed wrong answers ",wrongAnswers.toString());
        }
        Log.d("wrong answers ",wrongAnswers.toString());

        MediaPlayer info = MediaPlayer.create(this, R.raw.quest_select_color);
        MediaPlayer color = MediaPlayer.create(this, selectedAnswer.getColorSoundRef());
        info.start();
        info.setNextMediaPlayer(color);

        ImageButton button1;
        ImageButton button2;
        ImageButton button3;
        Random randButton = new Random();
        int randIntButton = randButton.nextInt(3);

        Log.i("ColorQuestionGame", "Random number "+ randIntButton);

        if(randIntButton ==1) {
            button1 = findViewById(R.id.answer1);
            button2 = findViewById(R.id.answer2);
            button3 = findViewById(R.id.answer3);
        }
        else if(randIntButton ==2){
            button1 = findViewById(R.id.answer2);
            button2 = findViewById(R.id.answer3);
            button3 = findViewById(R.id.answer1);
        }
        else {
            button1 = findViewById(R.id.answer3);
            button2 = findViewById(R.id.answer1);
            button3 = findViewById(R.id.answer2);
        }


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedAnswer.playCorrectSound();
                //Move to next game or Correct answer
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        runGame();
                    }
                }, 2000); // Millisecond 1000 = 1 sec

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
}
