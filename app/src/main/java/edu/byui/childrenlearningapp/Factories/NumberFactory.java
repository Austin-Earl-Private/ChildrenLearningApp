package edu.byui.childrenlearningapp.Factories;

import android.content.Context;

import java.util.ArrayList;

import edu.byui.childrenlearningapp.Models.A_Number;
import edu.byui.childrenlearningapp.Models.Number;
import edu.byui.childrenlearningapp.R;

public class NumberFactory {
    public static A_Number getNumber(String numberName, Context context, boolean iscorrect){
        String numberNameLower = numberName.toLowerCase();
        switch (numberNameLower){
            case "one":
                return new Number(numberName,context, R.raw.numbers_one,iscorrect,R.drawable.numbers_1);
            case "two":
                return new Number(numberName,context, R.raw.numbers_two,iscorrect,R.drawable.numbers_2);
            case "three":
                return new Number(numberName,context, R.raw.numbers_three,iscorrect,R.drawable.numbers_3);
            case "four":
                return new Number(numberName,context, R.raw.numbers_foure,iscorrect,R.drawable.numbers_4);
            case "five":
                return new Number(numberName,context, R.raw.numbers_five,iscorrect,R.drawable.numbers_5);
            case "six":
                return new Number(numberName,context, R.raw.numbers_six,iscorrect,R.drawable.numbers_6);
            case "seven":
                return new Number(numberName,context, R.raw.numbers_seven,iscorrect,R.drawable.numbers_7);
            case "eight":
                return new Number(numberName,context, R.raw.numbers_eight,iscorrect,R.drawable.numbers_8);
            case "nine":
                return new Number(numberName,context, R.raw.numbers_nine,iscorrect,R.drawable.numbers_9);
            case "ten":
                return new Number(numberName,context, R.raw.numbers_ten,iscorrect,R.drawable.numbers_10);
            case "eleven":
                return new Number(numberName,context, R.raw.numbers_eleven,iscorrect,R.drawable.numbers_11);
            case "twelve":
                return new Number(numberName,context, R.raw.numbers_twelve,iscorrect,R.drawable.numbers_12);
            case "thirteen":
                return new Number(numberName,context, R.raw.numbers_thirteen,iscorrect,R.drawable.numbers_13);
            case "fourteen":
                return new Number(numberName,context, R.raw.numbers_fourteen,iscorrect,R.drawable.numbers_14);
            case "fifteen":
                return new Number(numberName,context, R.raw.numbers_fifteen,iscorrect,R.drawable.numbers_15);
            case "sixteen":
                return new Number(numberName,context, R.raw.numbers_sixteen,iscorrect,R.drawable.numbers_16);
            case "seventeen":
                return new Number(numberName,context, R.raw.numbers_seventeen,iscorrect,R.drawable.numbers_17);
            case "eighteen":
                return new Number(numberName,context, R.raw.numbers_eighteen,iscorrect,R.drawable.numbers_18);
            case "nineteen":
                return new Number(numberName,context, R.raw.numbers_nineteen,iscorrect,R.drawable.numbers_19);
            case "twenty":
                return new Number(numberName,context, R.raw.numbers_twenty,iscorrect,R.drawable.numbers_20);


            default:
                return null;
        }
    }

    public static ArrayList<String> getAllPossibleNumbers(){
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        list.add("Eleven");
        list.add("Twelve");
        list.add("Thirteen");
        list.add("Fourteen");
        list.add("Fifteen");
        list.add("Sixteen");
        list.add("Seventeen");
        list.add("Eighteen");
        list.add("Nineteen");
        list.add("Twenty");
        return list;

    }
}
