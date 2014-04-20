package com.example.wallt;

import com.example.wallt.presenters.ServerUtility;
import com.example.wallt.views.MainActivity;

import android.app.Application;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.AsyncTask;

public class WALLTApplication extends Application {

    private ServerUtility server;
    public static WALLTApplication Instance = null;

    public void onCreate() {
        server = ServerUtility.getInstance();
        server.initalize(this);
        Instance = this;
        startService(new Intent(getApplicationContext(), MusicService.class));
    }
    

}
