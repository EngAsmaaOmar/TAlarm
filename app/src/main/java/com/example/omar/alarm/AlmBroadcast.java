package com.example.omar.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

/**
 * Created by Omar on 11/21/2017.
 */

public class AlmBroadcast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        intent = new Intent(context, Alarm_Activity.class);
        context.startService(intent);
        Toast.makeText(context ,"Start your Day with positive Energy" ,Toast.LENGTH_LONG).show();

       Vibrator  vibrator = (Vibrator)
        context.getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(3000);
    }


}
