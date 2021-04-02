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

import edu.byui.childrenlearningapp.Factories.ColorFactory;
import edu.byui.childrenlearningapp.Factories.ShapeFactory;
import edu.byui.childrenlearningapp.Models.A_Color;
import edu.byui.childrenlearningapp.Models.A_Shape;

public class ShapeQuestionGame extends AppCompatActivity {
    private A_Shape selectedAnswer;
    private ArrayList<A_Shape> wrongAnswers = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_shape_question_game);
        runGame();

    }



    public void GoToMenu(View view) {
        Intent menuGame = new Intent(this, GameMenu.class);
        startActivity(menuGame);
    }

    private void runGame(){
        ArrayList<String> shapeList = ShapeFactory.getAllPossibleShapes();
        Random rand =  new Random();
        Log.d("List",shapeList.toString());
        String selectedShape = shapeList.get(rand.nextInt(shapeList.size()));
        selectedAnswer = ShapeFactory.getShape(selectedShape,this,true);

        Log.d("Shape", "onCreate: selected Shape "+selectedShape +"  "+ "selected answer "+selectedAnswer);
        assert selectedAnswer != null;
        shapeList.remove(selectedAnswer.getShapeName());
        wrongAnswers.add(ShapeFactory.getShape(shapeList.get(rand.nextInt(shapeList.size())),this,false));
        wrongAnswers.add(ShapeFactory.getShape(shapeList.get(rand.nextInt(shapeList.size())),this,false));
        Log.d("wrong answers ",wrongAnswers.toString());

        MediaPlayer info = MediaPlayer.create(this, R.raw.quest_select_shape);
        MediaPlayer shape = MediaPlayer.create(this, selectedAnswer.getShapeSoundRef());
        info.start();
        info.setNextMediaPlayer(shape);

        ImageButton button1;
        ImageButton button2;
        ImageButton button3;
        Random randButton = new Random();
        int randIntButton = randButton.nextInt(3);

        Log.i("ShapeQuestionGame", "Random number "+ randIntButton);

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
                        //Intent next = new Intent(ShapeQuestionGame.this, ShapeQuestionGame.class);
                        //startActivity(next);
                        runGame();
                    }
                }, 2000); // Millisecond 1000 = 1 sec

            }
        });
        button1.setImageResource(selectedAnswer.getShapeImageRef());
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wrongAnswers.get(0).playWrongSound();
            }
        });
        button2.setImageResource(wrongAnswers.get(0).getShapeImageRef());


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wrongAnswers.get(1).playWrongSound();
            }
        });
        button3.setImageResource(wrongAnswers.get(1).getShapeImageRef());

    }
}
