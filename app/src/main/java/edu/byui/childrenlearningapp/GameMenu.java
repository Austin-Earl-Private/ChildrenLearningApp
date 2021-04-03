package edu.byui.childrenlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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
public class GameMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_menu);
    }


    public void startLetterGame (View btnLetter){
        Intent letterGame = new Intent(this, LetterGame.class);
        startActivity(letterGame);
    }
    public void startNumberGame (View btnNumber) {
        Intent numberGame = new Intent(this, NumberGame.class);
        startActivity(numberGame);
    }

    public void startColorGame (View btnColor) {
        Intent colorGame = new Intent(this, ColorGame.class);
        startActivity(colorGame);
    }

    public void startAnimalGame (View btnAnimal) {
        Intent animalGame = new Intent(this, AnimalGame.class);
        startActivity(animalGame);
    }
    public void startShapeGame (View btnAnimal) {
        Intent shapeGame = new Intent(this, ShapeGame.class);
        startActivity(shapeGame);
    }
    public void GoToExtraGames(View btnExtra){

        Intent extraGame = new Intent(this, ExtraGameMenu.class);
        startActivity(extraGame);
    }
    public void youtube(View vieew){
        Intent video = new Intent(this, Youtube.class);
        video.putExtra("youtube_video_id","RUSCz41aDug");
        startActivity(video);
    }

}