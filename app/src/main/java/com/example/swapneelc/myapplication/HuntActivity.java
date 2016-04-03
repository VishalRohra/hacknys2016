package com.example.swapneelc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class HuntActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hunt);

        Intent i = getIntent();

        String teamname = i.getStringExtra("teamname");

        TextView teamname_view = (TextView) findViewById(R.id.teamname);
        teamname_view.setText(teamname);
    }


}
