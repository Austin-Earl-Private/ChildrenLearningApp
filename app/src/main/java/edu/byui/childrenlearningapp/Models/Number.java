package edu.byui.childrenlearningapp.Models;

import android.content.Context;
import android.media.MediaPlayer;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Random;

import edu.byui.childrenlearningapp.R;

public class Number extends A_Number {
    String numberName = "";
    WeakReference<Context> contextWeakReference;
    int soundRef;
    boolean isCorrect = false;
    int imgRef;


    public Number(String numberName, Context context, int soundRef, boolean correct , int imageRef) {
        this.numberName = numberName;
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
        return "Number{" +
                "numberName='" + numberName + '\'' +
                ", contextWeakReference=" + contextWeakReference +
                ", soundRef=" + soundRef +
                ", isCorrect=" + isCorrect +
                ", imgRef=" + imgRef +
                '}';
    }

    @Override
    public void playNumberSound() {
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
    public String getNumberName() {
        return this.numberName;
    }

    @Override
    public int getNumberSoundRef() {
        return soundRef;
    }

    @Override
    public int getNumberImageRef() {
        return imgRef;
    }
}
