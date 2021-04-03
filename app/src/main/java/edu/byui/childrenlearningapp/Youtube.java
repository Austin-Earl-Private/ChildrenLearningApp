package edu.byui.childrenlearningapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Youtube extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youtube_video);
        String id = getIntent().getStringExtra("youtube_video_id");

        if(id != null && !id.isEmpty()){
            YouTubePlayerView player = (YouTubePlayerView) findViewById(R.id.youtube_player_view);
            player.getYouTubePlayerWhenReady(youTubePlayer -> {
                youTubePlayer.loadVideo(id,0);
            });
        }

    }
}
