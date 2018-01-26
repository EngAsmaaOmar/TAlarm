package com.example.omar.alarm;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;


public class Alarm_Activity extends AppCompatActivity {

    ProgressDialog progress;
    Button bualm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_);

        final EditText Txt = (EditText) findViewById(R.id.Alm_date);
        final Button bualm = (Button) findViewById(R.id.buAlarm);
      /*  int m = Integer.parseInt(Txt.getText().toString());
        Intent intent = new Intent(Alarm_Activity.this, AlmBroadcast.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this.getApplicationContext(), 112017, intent, 0);

        final AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()
                + (m * 1000), pendingIntent);
        Toast.makeText(this, "Alarm set in " + m + " seconds",
                Toast.LENGTH_LONG).show();


           ProgressDialog progress;

       */ bualm.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                int m = Integer.parseInt(Txt.getText().toString());
                Intent intent = new Intent(Alarm_Activity.this, AlmBroadcast.class);
                PendingIntent pendingIntent;
               pendingIntent = PendingIntent.getBroadcast(getApplicationContext(), 112017, intent, 0);
               AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
                alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()
                        + (m * 1000), pendingIntent);


                progress = new ProgressDialog(Alarm_Activity.this);
                progress.setMessage("Have a nice day");
                progress.setProgress(0);
                progress.setMax(100);
                progress.show();


            }

        });


        // public void Downloading (View view ){
        //  progress = new ProgressDialog(this);
        // progress.setMessage("Start your Day with positive Energy ");
        //  progress.setProgressStyle(ProgressDialog.BUTTON_NEGATIVE);
        // progress.setIndeterminate(true);
        // progress.setProgress(0);
        // }
    }
}
