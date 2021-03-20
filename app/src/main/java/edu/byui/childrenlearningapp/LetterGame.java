package edu.byui.childrenlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class LetterGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_game);

        final MediaPlayer info = MediaPlayer.create(this, R.raw.letters_lets_learn_the_letters_in_your_name);
        info.start();

        SharedPreferences preferences = getSharedPreferences(MainActivity.PREFERENCES, MODE_PRIVATE);
        String childName = preferences.getString(MainActivity.NAME, null).toUpperCase();

        LinearLayout letterView = findViewById(R.id.lettersView);
        LayoutInflater adder = LayoutInflater.from(this);

        Letters a = new Letters();
        a.setName("A");
        a.setVowel(true);


        for (int i=0; i<childName.length(); i++){
            View view = adder.inflate(R.layout.letter_item, letterView, false);

            ImageView letterImage = view.findViewById(R.id.letterImageView);
            char array_letter = childName.charAt(i);
            String letter = Character.toString(array_letter);
            switch (letter){
                case "A":
                    letterImage.setImageResource(R.drawable.letters_a);
                    //letterImage.setImageResource(a.onCreateDisplay());
                    break;
                case "B":
                    letterImage.setImageResource(R.drawable.letters_b);
                    break;
                case "C":
                    letterImage.setImageResource(R.drawable.letters_c);
                    break;
                case "D":
                    letterImage.setImageResource(R.drawable.letters_d);
                    break;
                case "E":
                    letterImage.setImageResource(R.drawable.letters_e);
                    break;
                case "F":
                    letterImage.setImageResource(R.drawable.letters_f);
                    break;
                case "G":
                    letterImage.setImageResource(R.drawable.letters_g);
                    break;
                case "H":
                    letterImage.setImageResource(R.drawable.letters_h);
                    break;
                case "I":
                    letterImage.setImageResource(R.drawable.letters_i);
                    break;
                case "J":
                    letterImage.setImageResource(R.drawable.letters_j);
                    break;
                case "K":
                    letterImage.setImageResource(R.drawable.letters_k);
                    break;
                case "L":
                    letterImage.setImageResource(R.drawable.letters_l);
                    break;
                case "M":
                    letterImage.setImageResource(R.drawable.letters_m);
                    break;
                case "N":
                    letterImage.setImageResource(R.drawable.letters_n);
                    break;
                case "O":
                    letterImage.setImageResource(R.drawable.letters_o);
                    break;
                case "P":
                    letterImage.setImageResource(R.drawable.letters_p);
                    break;
                case "Q":
                    letterImage.setImageResource(R.drawable.letters_q);
                    break;
                case "R":
                    letterImage.setImageResource(R.drawable.letters_r);
                    break;
                case "S":
                    letterImage.setImageResource(R.drawable.letters_s);
                    break;
                case "T":
                    letterImage.setImageResource(R.drawable.letters_t);
                    break;
                case "U":
                    letterImage.setImageResource(R.drawable.letters_u);
                    break;
                case "V":
                    letterImage.setImageResource(R.drawable.letters_v);
                    break;
                case "W":
                    letterImage.setImageResource(R.drawable.letters_w);
                    break;
                case "X":
                    letterImage.setImageResource(R.drawable.letters_x);
                    break;
                case "Y":
                    letterImage.setImageResource(R.drawable.letters_y);
                    break;
                case "Z":
                    letterImage.setImageResource(R.drawable.letters_z);
                    break;
                default:
                    Toast.makeText(this,"Not letter found for: "+letter, Toast.LENGTH_SHORT).show();
            }


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