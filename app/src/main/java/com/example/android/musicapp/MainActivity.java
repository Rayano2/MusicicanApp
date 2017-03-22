package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView classic = (TextView) findViewById(R.id.classic);


        classic.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Classic.class);

                startActivity(numbersIntent);
            }
        });

        TextView jazz=(TextView)findViewById(R.id.jazz);

        jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jazzpage =new Intent(getApplicationContext(),jazzmusic.class);
                startActivity(jazzpage);
            }
        });
    }

    public void Rock(View view) {
        Intent RockPage=new Intent(getApplicationContext(),RockMusic.class);
        startActivity(RockPage);
    }
}
