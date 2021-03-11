 package edu.byui.childrenlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    public static final String NAME = "CHILD_NAME";
    public static final String AGE = "CHILD_AGE";
    public static final String PREFERENCES = "PREFERENCES";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences sharedPref = getPreferences(MODE_PRIVATE);
        if(!sharedPref.contains(NAME)){
            Intent first_login = new Intent(this, FirstLogin.class);
            startActivity(first_login);
        }else{
            setContentView(R.layout.activity_main);
            Gson gson = new Gson();

            Child user = new Child();

            user.setName("Austin");
            user.setAge(5);

            String stringGsonUser = gson.toJson(user, Child.class);
        }





        //SharedPreferences.Editor prefEdit = sharedPref.edit();

        //prefEdit.putString("user", stringGsonUser);
        //prefEdit.commit();

        //Log.d("Testing Gson",stringGsonUser);

        //String json = sharedPref.getString("user","");
        //Child newUser = gson.fromJson(json, Child.class);

        //Log.d("New Gson:", newUser.toString());
    }

    public void getData(View btnAction){
        EditText getName = findViewById(R.id.txtName);
        EditText getAge = findViewById(R.id.txtAge);
        TextView display = findViewById(R.id.txtDisplay);

        Child user = new Child();

        user.setName(getName.getText().toString());
        user.setAge(Integer.parseInt(getAge.getText().toString()));

        SharedPreferences childPref = getSharedPreferences(MainActivity.PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor save = childPref.edit();

        save.putString(NAME, user.getName());
        save.putString(AGE, String.valueOf(user.getAge()));
        save.apply();

        Toast.makeText(this,"Name and Age saved of the Child", Toast.LENGTH_SHORT).show();

        //Intent intent = new Intent(this, Statics.class);
        //intent.putExtra(NAME, name);
        //intent.putExtra(AGE, age);

        //startActivity(intent);

    }

    public void DisplayData(View btnDisplay){
        SharedPreferences preferences = getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE);

        String childName = preferences.getString(NAME, null);
        String childAge = preferences.getString(AGE, null);

        TextView display = findViewById(R.id.txtDisplay);

        display.setText("Child name: "+childName+"\nChild age: "+childAge);

    }
}