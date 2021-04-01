package edu.byui.childrenlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class AnimalGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_game);

        MediaPlayer info = MediaPlayer.create(this, R.raw.animals_lets_learn_about_animals);
        info.start();
        info.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });

    }

    public void gameAnimalFirst(View btnNext){
        setContentView(R.layout.activity_animal_game);
    }
    public void gameAnimalSecond(View btnNext){
        setContentView(R.layout.activity_animal_game_2);
    }

    public void GoToMenu(View view) {
        Intent menuGame = new Intent(this, GameMenu.class);
        startActivity(menuGame);
    }

    public void BullName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_bull);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void CalfName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_calf);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void CatName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_cat);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }

    public void ChickName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_chick);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }

    public void CowName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_cow);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void DogName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_dog);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void DonkeyName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_donkey);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }

    public void DuckName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_duck);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void DucklingName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_duckling);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void FoalName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_foal);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void GoatName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_goat);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void GooseName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_goose);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void GuineaName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_guinea_fowl);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void HenName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_hen);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void HorseName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_horse);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void LambName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_lamb);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void PigName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_pig);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void RabbitName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_rabbit);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void RoosterName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_rooster);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void SheepName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_sheep);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void TurkeyName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_turkey);
        animalSound.start();
        animalSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }

}