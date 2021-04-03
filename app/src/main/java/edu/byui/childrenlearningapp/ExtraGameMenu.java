package edu.byui.childrenlearningapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Skeleton of an Android Things activity.
 * <p>
 * Android Things peripheral APIs are accessible through the PeripheralManager
 * For example, the snippet below will open a GPIO pin and set it to HIGH:
 * <p>
 * PeripheralManager manager = PeripheralManager.getInstance();
 * try {
 * Gpio gpio = manager.openGpio("BCM6");
 * gpio.setDirection(Gpio.DIRECTION_OUT_INITIALLY_LOW);
 * gpio.setValue(true);
 * } catch (IOException e) {
 * Log.e(TAG, "Unable to access GPIO");
 * }
 * <p>
 * You can find additional examples on GitHub: https://github.com/androidthings
 */

/**
 * In this method the user will open the Letter Game, where the kid will learn his/her name.
 * @param btnLetter
 */
public class ExtraGameMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_game_menu);
    }



    public void startQuestionAnimalGame(View btlQuestionColor){
        Log.d("testing","got to Animal question");
        Intent questionGame = new Intent(this, AnimalQuestionGame.class);
        startActivity(questionGame);
    }

    public void startQuestionColorGame(View btlQuestionColor){
        Log.d("testing","got to Color question");
        Intent questionGame = new Intent(this, ColorQuestionGame.class);
        startActivity(questionGame);
    }

    public void startQuestionNumberGame(View btlQuestionColor){
        Log.d("testing","got to Number question");
        Intent questionGame = new Intent(this, NumberQuestionGame.class);
        startActivity(questionGame);
    }

    public void startQuestionShapeGame(View btlQuestionColor){
        Log.d("testing","got to Shape question");
        Intent questionGame = new Intent(this, ShapeQuestionGame.class);
        startActivity(questionGame);
    }
    public void GoToMenu(View view) {
        Intent menuGame = new Intent(this, GameMenu.class);
        startActivity(menuGame);
    }

    public void youtube(View btnLetters){
        Intent video = new Intent(this, Youtube.class);
        video.putExtra("youtube_video_id","RUSCz41aDug");
        startActivity(video);
    }

}