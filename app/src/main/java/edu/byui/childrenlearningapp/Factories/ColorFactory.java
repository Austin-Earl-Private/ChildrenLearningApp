package edu.byui.childrenlearningapp.Factories;

import android.content.Context;

import java.util.ArrayList;

import edu.byui.childrenlearningapp.Models.A_Color;
import edu.byui.childrenlearningapp.Models.Color;
import edu.byui.childrenlearningapp.R;

public class ColorFactory {
    public static A_Color getColor(String colorName, Context context, boolean iscorrect){
        String colorNameLower = colorName.toLowerCase();
        switch (colorName){
            case "red":
                return new Color(colorName,context, R.raw.colors_red,iscorrect,R.drawable.colors_red_apple);
            case "blue":
                return new Color(colorName,context, R.raw.colors_blue,iscorrect,R.drawable.colors_blue_seawave);
            case "black":
                return new Color(colorName,context, R.raw.colors_black,iscorrect,R.drawable.colors_black_panther);
            case "brown":
                return new Color(colorName,context, R.raw.colors_brown,iscorrect,R.drawable.colors_brown_teddybear);
            case "green":
                return new Color(colorName,context, R.raw.colors_green,iscorrect,R.drawable.colors_green_leaf);
            case "grey":
                return new Color(colorName,context, R.raw.colors_grey,iscorrect,R.drawable.colors_grey_stone);
            case "orange":
                return new Color(colorName,context, R.raw.colors_orange,iscorrect,R.drawable.colors_orange_carrots);
            case "pink":
                return new Color(colorName,context, R.raw.colors_pink,iscorrect,R.drawable.colors_pink_strawberryscoop);
            case "purple":
                return new Color(colorName,context, R.raw.colors_purple,iscorrect,R.drawable.colors_purple_plum);
            case "white":
                return new Color(colorName,context, R.raw.colors_white,iscorrect,R.drawable.colors_white_polarbear);
            case "yellow":
                return new Color(colorName,context, R.raw.colors_yellow,iscorrect,R.drawable.colors_yellow_schoolbus);
            default:
                return null;
        }
    }

    public static ArrayList<String> getAllPossibleColors(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Black");
        list.add("Brown");
        list.add("Green");
        list.add("Grey");
        list.add("Orange");
        list.add("Pink");
        list.add("Purple");
        list.add("White");
        list.add("Yellow");
        return list;

    }
}
