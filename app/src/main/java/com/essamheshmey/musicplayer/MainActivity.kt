package com.essamheshmey.musicplayer

import android.annotation.SuppressLint
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val butplay:ImageButton=findViewById(R.id.but_play)
val mediaplayer:MediaPlayer=MediaPlayer.create(this,R.raw.a)

        butplay.setOnClickListener(){
            if (!mediaplayer.isPlaying){
                mediaplayer.start()
                butplay.setImageResource(R.drawable.i_pause)
            }else{
                mediaplayer.pause()
                butplay.setImageResource(R.drawable.i_play)
            }
        }
    }
}