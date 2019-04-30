package com.mensajeaveloz.androidgit;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class Servicio extends Service {
    private MediaPlayer mediaPlayer;
    private Context thisContext=this;
    @Override
    public void onCreate(){

    }
    @Override
    public int onStartCommand(Intent intent,int flag ,int idProcess){
        mediaPlayer=MediaPlayer.create(thisContext,R.raw.music);
        mediaPlayer.start();
        return START_STICKY;
    }
    @Override
    public void onDestroy(){
        mediaPlayer.stop();
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
