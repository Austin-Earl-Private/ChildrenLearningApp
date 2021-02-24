package edu.byui.childrenlearningapp;

public class Colors implements MediaPlayer{
    private String name;
    private Boolean primary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    @Override
    public void playSound() {
        //Here will declare how to call the sound of the name of the Color.
    }

    @Override
    public void onCreateDisplay() {
        //Here we will declare how to display the image of the Color.
    }

    @Override
    public void onPress() {
        //Here we will declare what happened when the kid tap the color.
    }
}
