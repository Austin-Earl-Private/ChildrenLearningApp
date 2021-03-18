package edu.byui.childrenlearningapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_login);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    /**
     * @author José Aguirre - Austin Earl - Iramar Vasquez
     * This function catch the data from the parent of the kid when the APP starts for the first time.
     * It is required to the game to have the name of the Kid, so this function prepare the initialization to make the games work properly.
     * The name and age of the kids are saved in a class called Child in its members variables and then are shared with the SharedPreferences of the MainActivity.
     * This Function it is called by a button in this FirsLogin layout
     */
    public void setData(View btnAction){


        EditText getName = findViewById(R.id.child_name);
        EditText getAge = findViewById(R.id.child_age);

        Child user = new Child();

        user.setName(getName.getText().toString());
        user.setAge(Integer.parseInt(getAge.getText().toString()));

        Log.i("Child Class","Data Stored in the class: "+user.toString());

        SharedPreferences childPref = getSharedPreferences(MainActivity.PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor save = childPref.edit();

        save.putString(MainActivity.NAME, user.getName());
        save.putString(MainActivity.AGE, String.valueOf(user.getAge()));
        save.apply();

        Toast.makeText(this,"Name and Age saved of the Child", Toast.LENGTH_SHORT).show();

        SharedPreferences preferences = getSharedPreferences(MainActivity.PREFERENCES, Context.MODE_PRIVATE);

        String childName = preferences.getString(MainActivity.NAME, null);
        String childAge = preferences.getString(MainActivity.AGE, null);

        Log.i("First Launch", "setData: Name:"+childName+" Age: "+childAge);

        Intent menu = new Intent(this, GameMenu.class);
        startActivity(menu);

        //Intent intent = new Intent(this, Statics.class);
        //intent.putExtra(NAME, name);
        //intent.putExtra(AGE, age);

        //startActivity(intent);

    }
}