package edu.byui.childrenlearningapp;

public class Shapes implements MediaPlayer{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void playSound() {
        //Here will declare how to call the sound of the name of the Shape.
    }

    @Override
    public void onCreateDisplay() {
        //Here we will declare how to display the image of the Shape.
    }

    @Override
    public void onPress() {
        //Here we will declare what happened when the kid tap the Shape.
    }
}
