package edu.byui.childrenlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class ShapeGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape_game);

        MediaPlayer info = MediaPlayer.create(this, R.raw.shapes_its_time_to_learn_some_shapes);
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

    public void CircleName(View btnShape){
        MediaPlayer shapeSound = MediaPlayer.create(this, R.raw.shapes_circle);
        shapeSound.start();
        shapeSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void DiamondName(View btnShape){
        MediaPlayer shapeSound = MediaPlayer.create(this, R.raw.shapes_diamond);
        shapeSound.start();
        shapeSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void HeartName(View btnShape){
        MediaPlayer shapeSound = MediaPlayer.create(this, R.raw.shapes_heart);
        shapeSound.start();
        shapeSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void HexagonName(View btnShape){
        MediaPlayer shapeSound = MediaPlayer.create(this, R.raw.shapes_hexagon);
        shapeSound.start();
        shapeSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void OvalName(View btnShape){
        MediaPlayer shapeSound = MediaPlayer.create(this, R.raw.shapes_oval);
        shapeSound.start();
        shapeSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void PentagonName(View btnShape){
        MediaPlayer shapeSound = MediaPlayer.create(this, R.raw.shapes_pentagon);
        shapeSound.start();
        shapeSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void RectangleName(View btnShape){
        MediaPlayer shapeSound = MediaPlayer.create(this, R.raw.shapes_rectangle);
        shapeSound.start();
        shapeSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void SquareName(View btnShape){
        MediaPlayer shapeSound = MediaPlayer.create(this, R.raw.shapes_square);
        shapeSound.start();
        shapeSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void starName(View btnShape){
        MediaPlayer shapeSound = MediaPlayer.create(this, R.raw.shapes_star);
        shapeSound.start();
        shapeSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }
    public void TriangleName(View btnShape){
        MediaPlayer shapeSound = MediaPlayer.create(this, R.raw.shapes_triangle);
        shapeSound.start();
        shapeSound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }

}