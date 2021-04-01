package edu.byui.childrenlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class NumberGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences preferences = getSharedPreferences(MainActivity.PREFERENCES, MODE_PRIVATE);
        int childAge = Integer.parseInt(preferences.getString(MainActivity.AGE, null));
        Log.i("NumberGame Age", "onCreate: Age "+childAge);
        if(childAge <5) {
            setContentView(R.layout.activity_number_game);
        }
        else {
            setContentView(R.layout.activity_number_game_1_10);
        }

        MediaPlayer info = MediaPlayer.create(this, R.raw.numbers_click_on_each_number_to_learn_how_to_say_it);
        info.start();
        info.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
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
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }

    public void numberTwo(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_two);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }

    public void numberThree(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_three);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }

    public void numberFour(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_foure);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }

    public void numberFive(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_five);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }

    public void numberSix(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_six);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }

    public void numberSeven(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_seven);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }

    public void numberEight(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_eight);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberNine(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_nine);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberTen(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_ten);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberEleven(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_eleven);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberTwelve(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twelve);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberThirteen(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_thirteen);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberFourteen(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_fourteen);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberFifteen(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_fifteen);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberSixteen(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_sixteen);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberSeventeen(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_seventeen);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberEighteen(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_eighteen);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberNineteen(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_nineteen);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberTwenty(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twenty);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberTwentyone(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twentyone);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberTwentytwo(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twentytwo);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberTwentythree(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twentythree);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberTwentyfour(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twentyfour);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberTwentyfive(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twentyfive);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberTwentysix(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twentysix);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberTwentyseven(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twentyseven);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberTwentyeight(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twentyeight);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberTwentynine(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_twentynine);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void numberThirty(View btnOne){
        MediaPlayer numberSound = MediaPlayer.create(this, R.raw.numbers_thirty);
        numberSound.start();
        numberSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
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