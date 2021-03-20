package edu.byui.childrenlearningapp;

public class Numbers implements MediaInterface {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void playSound() {
        //Here will declare how to call the sound of the name of the number.
    }

    @Override
    public void onCreateDisplay() {
        //Here we will declare how to display the image of the number.
    }

    @Override
    public void onPress() {
        //Here we will declare what happened when the kid tap the number.
    }
}
