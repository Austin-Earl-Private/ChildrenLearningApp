package edu.byui.childrenlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
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

        //Letters a = new Letters();
        //a.setName("A");
        //a.setVowel(true);
        //a.setImage(getDrawable(R.drawable.letters_a));


        for (int i=0; i<childName.length(); i++){
            View view = adder.inflate(R.layout.letter_item, letterView, false);

            ImageButton letterImage = view.findViewById(R.id.letterImageView);
            char array_letter = childName.charAt(i);
            String letter = Character.toString(array_letter);
            switch (letter){
                case "A":
                    letterImage.setImageResource(R.drawable.letters_a);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_a);
                            letterSound.start();
                        }
                    });
                    //letterImage.setImageResource(a.onCreateDisplay());
                    break;
                case "B":
                    letterImage.setImageResource(R.drawable.letters_b);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_b);
                            letterSound.start();
                        }
                    });
                    break;
                case "C":
                    letterImage.setImageResource(R.drawable.letters_c);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_c);
                            letterSound.start();
                        }
                    });
                    break;
                case "D":
                    letterImage.setImageResource(R.drawable.letters_d);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_d);
                            letterSound.start();
                        }
                    });
                    break;
                case "E":
                    letterImage.setImageResource(R.drawable.letters_e);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_e);
                            letterSound.start();
                        }
                    });
                    break;
                case "F":
                    letterImage.setImageResource(R.drawable.letters_f);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_f);
                            letterSound.start();
                        }
                    });
                    break;
                case "G":
                    letterImage.setImageResource(R.drawable.letters_g);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_g);
                            letterSound.start();
                        }
                    });
                    break;
                case "H":
                    letterImage.setImageResource(R.drawable.letters_h);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_h);
                            letterSound.start();
                        }
                    });
                    break;
                case "I":
                    letterImage.setImageResource(R.drawable.letters_i);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_i);
                            letterSound.start();
                        }
                    });
                    break;
                case "J":
                    letterImage.setImageResource(R.drawable.letters_j);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_j);
                            letterSound.start();
                        }
                    });
                    break;
                case "K":
                    letterImage.setImageResource(R.drawable.letters_k);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_k);
                            letterSound.start();
                        }
                    });
                    break;
                case "L":
                    letterImage.setImageResource(R.drawable.letters_l);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_l);
                            letterSound.start();
                        }
                    });
                    break;
                case "M":
                    letterImage.setImageResource(R.drawable.letters_m);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_m);
                            letterSound.start();
                        }
                    });
                    break;
                case "N":
                    letterImage.setImageResource(R.drawable.letters_n);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_n);
                            letterSound.start();
                        }
                    });
                    break;
                case "O":
                    letterImage.setImageResource(R.drawable.letters_o);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_o);
                            letterSound.start();
                        }
                    });
                    break;
                case "P":
                    letterImage.setImageResource(R.drawable.letters_p);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_p);
                            letterSound.start();
                        }
                    });
                    break;
                case "Q":
                    letterImage.setImageResource(R.drawable.letters_q);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_q);
                            letterSound.start();
                        }
                    });
                    break;
                case "R":
                    letterImage.setImageResource(R.drawable.letters_r);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_r);
                            letterSound.start();
                        }
                    });
                    break;
                case "S":
                    letterImage.setImageResource(R.drawable.letters_s);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_s);
                            letterSound.start();
                        }
                    });
                    break;
                case "T":
                    letterImage.setImageResource(R.drawable.letters_t);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_t);
                            letterSound.start();
                        }
                    });
                    break;
                case "U":
                    letterImage.setImageResource(R.drawable.letters_u);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_u);
                            letterSound.start();
                        }
                    });
                    break;
                case "V":
                    letterImage.setImageResource(R.drawable.letters_v);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_v);
                            letterSound.start();
                        }
                    });
                    break;
                case "W":
                    letterImage.setImageResource(R.drawable.letters_w);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_w);
                            letterSound.start();
                        }
                    });
                    break;
                case "X":
                    letterImage.setImageResource(R.drawable.letters_x);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_x);
                            letterSound.start();
                        }
                    });
                    break;
                case "Y":
                    letterImage.setImageResource(R.drawable.letters_y);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_y);
                            letterSound.start();
                        }
                    });
                    break;
                case "Z":
                    letterImage.setImageResource(R.drawable.letters_z);
                    letterImage.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_z);
                            letterSound.start();
                        }
                    });
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