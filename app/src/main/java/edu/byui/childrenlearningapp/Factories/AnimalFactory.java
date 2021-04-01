package edu.byui.childrenlearningapp.Factories;

import android.content.Context;

import java.util.ArrayList;

import edu.byui.childrenlearningapp.Models.A_Animal;
import edu.byui.childrenlearningapp.Models.Animal;
import edu.byui.childrenlearningapp.R;

public class AnimalFactory {
    public static A_Animal getAnimal(String animalName, Context context, boolean iscorrect){
        String animalNameLower = animalName.toLowerCase();
        switch (animalNameLower){
            case "bull":
                return new Animal(animalName,context, R.raw.animals_bull,iscorrect,R.drawable.animals_bull);
            case "cat":
                return new Animal(animalName,context, R.raw.animals_cat,iscorrect,R.drawable.animals_cat);
            case "chick":
                return new Animal(animalName,context, R.raw.animals_chick,iscorrect,R.drawable.animals_chicken);
            case "cow":
                return new Animal(animalName,context, R.raw.animals_cow,iscorrect,R.drawable.animals_cow);
            case "dog":
                return new Animal(animalName,context, R.raw.animals_dog,iscorrect,R.drawable.animals_dog);
            case "donkey":
                return new Animal(animalName,context, R.raw.animals_donkey,iscorrect,R.drawable.animals_donkey);
            case "duck":
                return new Animal(animalName,context, R.raw.animals_duck,iscorrect,R.drawable.animals_duck);
            case "goat":
                return new Animal(animalName,context, R.raw.animals_goat,iscorrect,R.drawable.animals_goat);
            case "goose":
                return new Animal(animalName,context, R.raw.animals_goose,iscorrect,R.drawable.animals_goose);
            case "hen":
                return new Animal(animalName,context, R.raw.animals_hen,iscorrect,R.drawable.animals_hen);
            case "horse":
                return new Animal(animalName,context, R.raw.animals_horse,iscorrect,R.drawable.animals_horse);
            case "pig":
                return new Animal(animalName,context, R.raw.animals_pig,iscorrect,R.drawable.animals_pig);
            case "rabbit":
                return new Animal(animalName,context, R.raw.animals_rabbit,iscorrect,R.drawable.animals_rabbit);
            case "rooster":
                return new Animal(animalName,context, R.raw.animals_rooster,iscorrect,R.drawable.animals_rooster);
            case "sheep":
                return new Animal(animalName,context, R.raw.animals_sheep,iscorrect,R.drawable.animals_sheep);
            case "turkey":
                return new Animal(animalName,context, R.raw.animals_turkey,iscorrect,R.drawable.animals_turkey);
            default:
                return null;
        }
    }

    public static ArrayList<String> getAllPossibleAnimals(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Bull");
        list.add("Cat");
        list.add("Chick");
        list.add("Cow");
        list.add("Dog");
        list.add("Donkey");
        list.add("Duck");
        list.add("Goat");
        list.add("Goose");
        list.add("Hen");
        list.add("Horse");
        list.add("Pig");
        list.add("Rabbit");
        list.add("Rooster");
        list.add("Sheep");
        list.add("Turkey");




        return list;

    }
}
