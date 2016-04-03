package com.example.swapneelc.myapplication;

import android.app.Activity;
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


/**
 * Created by arub on 4/2/16.
 */
public class CreateTeam extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_team);

        String teamname = (String) findViewById(R.id.teamname);
        Integer numobjective = (Integer) findViewById(R.id.numobjective);
        Button b = (Button) findViewById(R.id.createteam);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        System.out.println(name);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CreateTeam.this, .class);
                i.putExtra("name", tv.getText().toString());
                startActivity(i);
            }
        });


    }

}
