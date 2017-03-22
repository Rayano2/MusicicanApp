package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class jazzmusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazzmusic);

        Button gobackjazz=(Button)findViewById(R.id.gobackjazz);
        gobackjazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gobacktojazz=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(gobacktojazz);
            }
        });

        Button famousjazz=(Button)findViewById(R.id.famousJazz);
        famousjazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotojazz=new Intent(getApplicationContext(),FamousJazz.class);
                startActivity(gotojazz);

            }
        });
    }
}
