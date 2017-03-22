package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.example.android.musicapp.R.id.famousrock;
import static com.example.android.musicapp.R.id.gobackmainpage;

public class RockMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_music);

        Button gobackrock=(Button)findViewById(gobackmainpage);
        gobackrock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gobacktorock=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(gobacktorock);
            }
        });

        Button famousrock1=(Button)findViewById(famousrock);
        famousrock1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotorock=new Intent(getApplicationContext(),FamousRock.class);
                startActivity(gotorock);

            }
        });
    }
}



