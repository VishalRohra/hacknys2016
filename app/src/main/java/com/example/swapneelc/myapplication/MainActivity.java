package com.example.swapneelc.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        final TextView tv = (TextView) findViewById(R.id.input_email);
        Button b = (Button) findViewById(R.id.join);
        Button c = (Button) findViewById(R.id.create);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, JoinTeam.class);
                i.putExtra("name", tv.getText().toString());
                startActivity(i);
            }
        });


        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CreateTeam.class);
                i.putExtra("name", tv.getText().toString());
                startActivity(i);
            }
        });

    }




}
