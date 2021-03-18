 package edu.byui.childrenlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

 /**
  * @author José Aguirre - Austin Earl - Iramar Vasquez
  *
  * In this MainActivity we are creating the shared preferences to store the user information (Name and Age of the kid).
  * It has an if - else statement to call the FirstLogin Activity to set the data of the kid when the app runs for the first time.
  * When the Name and Age are stored, the App will start in the GameMenu Class every next time the user will open the game.
  */
 public class MainActivity extends AppCompatActivity {

    public static final String NAME = "CHILD_NAME";
    public static final String AGE = "CHILD_AGE";
    public static final String PREFERENCES = "PREFERENCES";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences sharedPref = getSharedPreferences(MainActivity.PREFERENCES, Context.MODE_PRIVATE);
        if(!sharedPref.contains(NAME)){
            Intent first_login = new Intent(this, FirstLogin.class);
            startActivity(first_login);
        }else{
            //setContentView(R.layout.activity_main);
            Intent menuGame = new Intent(this, GameMenu.class);
            startActivity(menuGame);
        }


        //SharedPreferences.Editor prefEdit = sharedPref.edit();

        //prefEdit.putString("user", stringGsonUser);
        //prefEdit.commit();

        //Log.d("Testing Gson",stringGsonUser);

        //String json = sharedPref.getString("user","");
        //Child newUser = gson.fromJson(json, Child.class);

        //Log.d("New Gson:", newUser.toString());
    }


}