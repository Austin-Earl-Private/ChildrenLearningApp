package edu.byui.childrenlearningapp;

public class Letters implements MediaPlayer{

    private String name;
    private Boolean vowel;

    public String getName() {
        return name;
    }

    public Boolean getVowel() {
        return vowel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVowel(Boolean vowel) {
        this.vowel = vowel;
    }

    @Override
    public void playSound() {
        //Here will declare how to call the sound of the letter.
    }

    @Override
    public void onCreateDisplay() {
        //Here we will declare how to display the image of the letter.
    }

    @Override
    public void onPress() {
        //Here we will declare what happened when the kid tap the letter.
    }
}
