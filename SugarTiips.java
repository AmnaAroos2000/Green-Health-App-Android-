package com.amna.greenhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class SugarTiips extends AppCompatActivity {

    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugar_tiips);

        //connecting back buttton using onclick mtd
        backButton = findViewById(R.id.imageButton2);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SugarTiips.this, Sugar.class);
                startActivity(intent);
            }
        });

        //insertion of video
        VideoView videoView = findViewById(R.id.videoView3);
        videoView.setVideoPath("android.resource://"+getPackageName() + "/" + R.raw.diabetes);
        videoView.start();
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        //insertion of video
        VideoView video = findViewById(R.id.videoView4);
        video.setVideoPath("android.resource://"+getPackageName() + "/" + R.raw.dmealplan);
        video.start();
        MediaController media = new MediaController(this);
        media.setAnchorView(videoView);
        video.setMediaController(mediaController);

    }
}