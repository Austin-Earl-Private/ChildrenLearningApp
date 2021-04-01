package edu.byui.childrenlearningapp.Models;

import android.content.Context;
import android.media.MediaPlayer;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Random;

import edu.byui.childrenlearningapp.R;

public class Shape extends A_Shape {
    String shapeName = "";
    WeakReference<Context> contextWeakReference;
    int soundRef;
    boolean isCorrect = false;
    int imgRef;


    public Shape(String shapeName, Context context, int soundRef, boolean correct , int imageRef) {
        this.shapeName = shapeName;
        this.contextWeakReference = new WeakReference<>(context);
        this.soundRef = soundRef;
        this.isCorrect = correct;
        this.imgRef = imageRef;
    }


    @Override
    public void playWrongSound() {
        if(contextWeakReference.get() == null){
            return;
        }
        ArrayList<MediaPlayer> players = new ArrayList<>();

        MediaPlayer player = MediaPlayer.create(contextWeakReference.get(), R.raw.warning_oh_no);
        players.add(player);
        player = MediaPlayer.create(contextWeakReference.get(), R.raw.warning_oh_oh);
        players.add(player);
        player = MediaPlayer.create(contextWeakReference.get(), R.raw.warning_try_again);
        players.add(player);

        Random rand = new Random();
        player = players.get(rand.nextInt(players.size()));
        player.start();
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }

    @Override
    public void playCorrectSound() {
        if(contextWeakReference.get() == null){
            return;
        }
        ArrayList<MediaPlayer> players = new ArrayList<>();

        MediaPlayer player = MediaPlayer.create(contextWeakReference.get(), R.raw.compliments_awesome);
        players.add(player);
        player = MediaPlayer.create(contextWeakReference.get(), R.raw.compliments_fantastic);
        players.add(player);
        player = MediaPlayer.create(contextWeakReference.get(), R.raw.compliments_great);
        players.add(player);
        player = MediaPlayer.create(contextWeakReference.get(), R.raw.compliments_well_done);
        players.add(player);

        Random rand = new Random();
//        players.get(rand.nextInt(players.size())).start();
        player = players.get(rand.nextInt(players.size()));
        player.start();
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }

    @Override
    public String toString() {
        return "Shape{" +
                "ShapeName='" + shapeName + '\'' +
                ", contextWeakReference=" + contextWeakReference +
                ", soundRef=" + soundRef +
                ", isCorrect=" + isCorrect +
                ", imgRef=" + imgRef +
                '}';
    }

    @Override
    public void playShapeSound() {
        if(contextWeakReference.get() == null){
            return;
        }

       MediaPlayer player =  MediaPlayer.create(contextWeakReference.get(),soundRef);
        player.start();
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        });
    }

    @Override
    public String getShapeName() {
        return this.shapeName;
    }

    @Override
    public int getShapeSoundRef() {
        return soundRef;
    }

    @Override
    public int getShapeImageRef() {
        return imgRef;
    }
}
