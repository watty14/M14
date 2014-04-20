package com.example.wallt;


import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;

public class MusicService extends Service {
	
	private final IBinder mBinder = (IBinder) new ServiceBinder();
	private MediaPlayer mPlayer;

	public MusicService() {
	}
	
	private class ServiceBinder extends Binder {
		public MusicService getService() {
			return MusicService.this;
		}
	}

    @Override
    public IBinder onBind(Intent arg0) {
    	return mBinder;
    }

    @Override
    public void onCreate () {
	  super.onCreate();
       mPlayer = MediaPlayer.create(this, R.raw.wii); 
       mPlayer.setLooping(true); // Set looping 
       mPlayer.setVolume(100,100); 
       mPlayer.start(); 
    }
}
