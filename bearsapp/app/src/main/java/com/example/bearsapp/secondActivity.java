package com.example.bearsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class secondActivity extends AppCompatActivity {
 ImageButton play;
 ImageButton pause;
 MediaPlayer amazing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        amazing= MediaPlayer.create(this,R.raw.amazing);
        play= findViewById(R.id.PlayButton);
        pause=findViewById(R.id.PauseButton);
    }
    public void Play(View v){
        amazing.start();
        play.setEnabled(false);
        pause.setEnabled(true);
    }
    public void Pause(View v){
        amazing.pause();
        pause.setEnabled(false);
        play.setEnabled(true);
    }
}