package com.mensajeaveloz.androidgit;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class Servicio extends Service {
    private MediaPlayer mediaPlayer;
    private Context thisContext=this;
    @Override
    public void onCreate(){
        Toast.makeText(this, "Servicio Creado!",Toast.LENGTH_SHORT).show();
        mediaPlayer=MediaPlayer.create(thisContext,R.raw.music);

    }
    @Override
    public int onStartCommand(Intent intent,int flag ,int idProcess){
        Toast.makeText(this,"Servicio Iniciado!",Toast.LENGTH_SHORT).show();
        mediaPlayer.start();

        return super.onStartCommand(intent, flag, idProcess);
    }

    
    @Override
    public void onDestroy(){
        Toast.makeText(this,"Servicio Destruido!",Toast.LENGTH_SHORT).show();
        mediaPlayer.release();
        //mediaPlayer.stop();
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
