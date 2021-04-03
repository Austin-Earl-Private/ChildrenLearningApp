package edu.byui.childrenlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        SharedPreferences preferences = getSharedPreferences(MainActivity.PREFERENCES, MODE_PRIVATE);
        int childAge = Integer.parseInt(preferences.getString(MainActivity.AGE, null));
        Log.i("LetterGame Age", "onCreate: Age "+childAge);
        if(childAge <5){
            setContentView(R.layout.activity_letter_game);

            String childName = preferences.getString(MainActivity.NAME, null).toUpperCase();
            String childLastName = preferences.getString(MainActivity.LAST_NAME, null).toUpperCase();

            LinearLayout letterViewName = findViewById(R.id.lettersView);
            LayoutInflater adderName = LayoutInflater.from(this);


            //Letters a = new Letters();
            //a.setName("A");
            //a.setVowel(true);
            //a.setImage(getDrawable(R.drawable.letters_a));


            for (int i=0; i<childName.length(); i++){
                View view = adderName.inflate(R.layout.letter_item, letterViewName, false);

                ImageButton letterImage = view.findViewById(R.id.letterImageView);
                char array_letter = childName.charAt(i);
                String letter = Character.toString(array_letter);
                letterImage = getLetter(letter, letterImage);

                letterViewName.addView(view);

            }
        }
        else {
            setContentView(R.layout.activity_letter_game_last_name);

            String childName = preferences.getString(MainActivity.NAME, null).toUpperCase();
            String childLastName = preferences.getString(MainActivity.LAST_NAME, null).toUpperCase();

            LinearLayout letterViewName = findViewById(R.id.lettersViewName);
            LayoutInflater adderName = LayoutInflater.from(this);


            //Letters a = new Letters();
            //a.setName("A");
            //a.setVowel(true);
            //a.setImage(getDrawable(R.drawable.letters_a));


            for (int i=0; i<childName.length(); i++){
                View view = adderName.inflate(R.layout.letter_item, letterViewName, false);

                ImageButton letterImage = view.findViewById(R.id.letterImageView);
                char array_letter = childName.charAt(i);
                String letter = Character.toString(array_letter);
                letterImage = getLetter(letter, letterImage);

                letterViewName.addView(view);

            }

            LinearLayout letterViewLastName = findViewById(R.id.lettersViewLast);
            LayoutInflater adderLastName = LayoutInflater.from(this);

            for (int i=0; i<childLastName.length(); i++){
                View view = adderLastName.inflate(R.layout.letter_item, letterViewLastName, false);

                ImageButton letterImage = view.findViewById(R.id.letterImageView);
                char array_letter = childLastName.charAt(i);
                String letter = Character.toString(array_letter);
                letterImage = getLetter(letter, letterImage);

                letterViewLastName.addView(view);

            }
        }


        final MediaPlayer info = MediaPlayer.create(this, R.raw.letters_lets_learn_the_letters_in_your_name);
        info.start();
        info.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });



    }
    public void GoToMenu(View view) {
        Intent menuGame = new Intent(this, GameMenu.class);
        startActivity(menuGame);
    }

    public ImageButton getLetter(String charName, ImageButton letterImage){
        switch (charName){
            case "A":
                letterImage.setImageResource(R.drawable.letters_a);
                letterImage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer letterSound = MediaPlayer.create(LetterGame.this.getApplicationContext(), R.raw.letters_name_a);
                        letterSound.start();
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
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
                        letterSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mediaPlayer) {
                                mediaPlayer.stop();
                                mediaPlayer.release();
                            }
                        });
                    }
                });
                break;
            default:
                Toast.makeText(this,"Not letter found for: "+charName, Toast.LENGTH_SHORT).show();
        }
        return letterImage;
    }

    /**public void showName(View btnDisplay){
        SharedPreferences preferences = getSharedPreferences(MainActivity.PREFERENCES, MODE_PRIVATE);

        String childName = preferences.getString(MainActivity.NAME, null);
        String childAge = preferences.getString(MainActivity.AGE, null);
        Log.i("ShowName", "Getting SharedPreferences Name: "+childName+" "+MainActivity.NAME);
        TextView display = findViewById(R.id.txtDisplayName);

        display.setText("Name: "+childName);

    }*/


}