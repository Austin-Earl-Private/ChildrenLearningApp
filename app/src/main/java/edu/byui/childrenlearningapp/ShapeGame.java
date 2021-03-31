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
    }

    public void GoToMenu(View view) {
        Intent menuGame = new Intent(this, GameMenu.class);
        startActivity(menuGame);
    }

    public void CircleName(View btnShape){
        MediaPlayer shapeSound = MediaPlayer.create(this, R.raw.shapes_circle);
        shapeSound.start();
    }
    public void DiamondName(View btnShape){
        MediaPlayer shapeSound = MediaPlayer.create(this, R.raw.shapes_diamond);
        shapeSound.start();
    }
    public void HeartName(View btnShape){
        MediaPlayer shapeSound = MediaPlayer.create(this, R.raw.shapes_heart);
        shapeSound.start();
    }
    public void HexagonName(View btnShape){
        MediaPlayer shapeSound = MediaPlayer.create(this, R.raw.shapes_hexagon);
        shapeSound.start();
    }
    public void OvalName(View btnShape){
        MediaPlayer shapeSound = MediaPlayer.create(this, R.raw.shapes_oval);
        shapeSound.start();
    }
    public void PentagonName(View btnShape){
        MediaPlayer shapeSound = MediaPlayer.create(this, R.raw.shapes_pentagon);
        shapeSound.start();
    }
    public void RectangleName(View btnShape){
        MediaPlayer shapeSound = MediaPlayer.create(this, R.raw.shapes_rectangle);
        shapeSound.start();
    }
    public void SquareName(View btnShape){
        MediaPlayer shapeSound = MediaPlayer.create(this, R.raw.shapes_square);
        shapeSound.start();
    }
    public void starName(View btnShape){
        MediaPlayer shapeSound = MediaPlayer.create(this, R.raw.shapes_star);
        shapeSound.start();
    }
    public void TriangleName(View btnShape){
        MediaPlayer shapeSound = MediaPlayer.create(this, R.raw.shapes_triangle);
        shapeSound.start();
    }

}