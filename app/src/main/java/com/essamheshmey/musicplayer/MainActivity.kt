package com.essamheshmey.musicplayer

import android.annotation.SuppressLint
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageButton
import android.widget.SeekBar


class MainActivity : AppCompatActivity() {
lateinit var runnable: Runnable
private var handler=Handler()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val butplay:ImageButton=findViewById(R.id.but_play)
        val seekbar:SeekBar=findViewById(R.id.seekbar)

val mediaplayer:MediaPlayer=MediaPlayer.create(this,R.raw.a)
        seekbar.progress=0
        seekbar.max=mediaplayer.duration
        butplay.setOnClickListener(){
            if (!mediaplayer.isPlaying){
                mediaplayer.start()
                butplay.setImageResource(R.drawable.i_pause)
            }else{
                mediaplayer.pause()
                butplay.setImageResource(R.drawable.i_play)
            }
        }
seekbar.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
    override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
        if (p2){
            mediaplayer.seekTo(p1)
        }
    }

    override fun onStartTrackingTouch(p0: SeekBar?) {
    }

    override fun onStopTrackingTouch(p0: SeekBar?) {

    }
})
    }
}