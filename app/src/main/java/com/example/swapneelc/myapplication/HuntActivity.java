package com.example.swapneelc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class HuntActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hunt);

        Intent i = getIntent();

        String teamname = i.getStringExtra("teamname");



        TextView teamname_view = (TextView) findViewById(R.id.teamname);
        teamname_view.setText("Team " + teamname);


        final TextView timeleft_view = (TextView) findViewById(R.id.timeleft);

        new CountDownTimer(30*1000, 1000) {
            public void onTick(long millisUntilFinished) {
                timeleft_view.setText(millisUntilFinished/1000 + "s left");
            }
            public void onFinish() {
                timeleft_view.setText("done!");
            }
        }.start();
    }

    public void startTimer(TextView timeleft_view) {

        Integer time = 0;
        Integer limit = 60*1000;
        Integer timeleft = limit;

        while (time < limit) {
            try {
                wait(1000);
            } catch(Exception e) {}
            timeleft -= 1000;
            timeleft_view.setText(timeleft + "s left");
            time += 1000;
        }
    }
}
