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
    }
    public void CalfName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_calf);
        animalSound.start();
    }
    public void CatName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_cat);
        animalSound.start();
    }

    public void ChickName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_chick);
        animalSound.start();
    }

    public void CowName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_cow);
        animalSound.start();
    }
    public void DogName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_dog);
        animalSound.start();
    }
    public void DonkeyName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_donkey);
        animalSound.start();
    }

    public void DuckName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_duck);
        animalSound.start();
    }
    public void DucklingName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_duckling);
        animalSound.start();
    }
    public void FoalName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_foal);
        animalSound.start();
    }
    public void GoatName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_goat);
        animalSound.start();
    }
    public void GooseName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_goose);
        animalSound.start();
    }
    public void GuineaName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_guinea_fowl);
        animalSound.start();
    }
    public void HenName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_hen);
        animalSound.start();
    }
    public void HorseName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_horse);
        animalSound.start();
    }
    public void LambName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_lamb);
        animalSound.start();
    }
    public void PigName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_pig);
        animalSound.start();
    }
    public void RabbitName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_rabbit);
        animalSound.start();
    }
    public void RoosterName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_rooster);
        animalSound.start();
    }
    public void SheepName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_sheep);
        animalSound.start();
    }
    public void TurkeyName(View btnAnimal){
        MediaPlayer animalSound = MediaPlayer.create(this, R.raw.animals_turkey);
        animalSound.start();
    }

}