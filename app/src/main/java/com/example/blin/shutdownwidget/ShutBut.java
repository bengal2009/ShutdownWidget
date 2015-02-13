package com.example.blin.shutdownwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;

/**
 * Created by blin on 2015/2/12.
 */
public class ShutBut extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        if(Intent.ACTION_SHUTDOWN.equalsIgnoreCase(intent.getAction())) {
            // database operation
        }

        if(Intent.ACTION_BOOT_COMPLETED.equalsIgnoreCase(intent.getAction())) {
            // some operation
        }

        if(Intent.ACTION_AIRPLANE_MODE_CHANGED
                .equalsIgnoreCase(intent.getAction().intern())) {
            // some operation
        }

        if(ConnectivityManager.CONNECTIVITY_ACTION
                .equalsIgnoreCase(intent.getAction())) {
            // some operation
        }
    }
}