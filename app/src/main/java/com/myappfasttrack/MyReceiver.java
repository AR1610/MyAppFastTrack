package com.myappfasttrack;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;

public class MyReceiver extends BroadcastReceiver {

MediaPlayer mediaPlayer;
    @Override
    public void onReceive(Context context, Intent intent) {
       mediaPlayer = MediaPlayer.create(context,R.raw.alarmsound);
       mediaPlayer.start();
    }
}