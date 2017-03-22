package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Classic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic);




    }

    public void famous(View view) {
        Intent famuspage=new Intent(getApplicationContext(),FsmousClassic.class);
        startActivity(famuspage);
    }

    public void goback(View view) {
        Intent gobacktomain=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(gobacktomain);
    }
}
