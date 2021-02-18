package edu.byui.childrenlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Hi from the end of the World");
        System.out.println("I am changing the message to test merging conflicts. Iramar - Austin - Jose Aguirre");

    }
}