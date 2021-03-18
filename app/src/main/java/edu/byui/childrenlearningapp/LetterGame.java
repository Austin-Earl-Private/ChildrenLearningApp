package edu.byui.childrenlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class LetterGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_game);
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