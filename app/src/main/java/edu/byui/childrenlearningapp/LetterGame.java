package edu.byui.childrenlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LetterGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_game);

        SharedPreferences preferences = getSharedPreferences(MainActivity.PREFERENCES, MODE_PRIVATE);

        String childName = preferences.getString(MainActivity.NAME, null);

        LinearLayout letterView = findViewById(R.id.lettersView);
        LayoutInflater adder = LayoutInflater.from(this);

        for (int i=0; i<childName.length(); i++){
            View view = adder.inflate(R.layout.letter_item, letterView, false);

            ImageView letterImage = view.findViewById(R.id.letterImageView);
            letterImage.setImageResource(R.drawable.abc_button);

            letterView.addView(view);

        }
    }

    public void showName(View btnDisplay){
        SharedPreferences preferences = getSharedPreferences(MainActivity.PREFERENCES, MODE_PRIVATE);

        String childName = preferences.getString(MainActivity.NAME, null);
        String childAge = preferences.getString(MainActivity.AGE, null);
        Log.i("ShowName", "Getting SharedPreferences Name: "+childName+" "+MainActivity.NAME);
        TextView display = findViewById(R.id.txtDisplayName);

        display.setText("Name: "+childName);


        

    }
}