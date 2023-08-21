package com.amna.greenhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class CommonTips extends AppCompatActivity {

    ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_tips);

        //insertion of video
        VideoView videoView = findViewById(R.id.videoView1);
        videoView.setVideoPath("android.resource://"+getPackageName() + "/" + R.raw.healthy);
        videoView.start();
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        //nsertion of scnd video
        VideoView video = findViewById(R.id.videoView2);
        video.setVideoPath("android.resource://"+getPackageName() + "/" + R.raw.nutrients);
        video.start();
        MediaController media = new MediaController(this);
        media.setAnchorView(video);
        video.setMediaController(media);

        //linking back button using onclick listner
        backButton = findViewById(R.id.imageButton2);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CommonTips.this, CommonFood.class);
                startActivity(intent);
            }
        });

    }
}