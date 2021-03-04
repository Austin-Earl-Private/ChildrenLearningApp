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

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    public static final String NAME = "CHILD_NAME";
    public static final String AGE = "CHILD_AGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        Child user = new Child();

        user.setName("Austin");
        user.setAge(5);

        String stringGsonUser = gson.toJson(user, Child.class);

        SharedPreferences sharedPref = getPreferences(MODE_PRIVATE);

        //SharedPreferences.Editor prefEdit = sharedPref.edit();

        //prefEdit.putString("user", stringGsonUser);
        //prefEdit.commit();

        //Log.d("Testing Gson",stringGsonUser);

        String json = sharedPref.getString("user","");
        Child newUser = gson.fromJson(json, Child.class);

        Log.d("New Gson:", newUser.toString());
    }

    public void getData(View btnAction){
        String name;
        int age;

        EditText getName = findViewById(R.id.txtName);
        EditText getAge = findViewById(R.id.txtAge);
        TextView display = findViewById(R.id.txtDisplay);

        name = getName.getText().toString();
        age = Integer.parseInt(getAge.getText().toString());

        Intent intent = new Intent(this, Statics.class);
        intent.putExtra(NAME, name);
        intent.putExtra(AGE, age);

        startActivity(intent);

    }
}