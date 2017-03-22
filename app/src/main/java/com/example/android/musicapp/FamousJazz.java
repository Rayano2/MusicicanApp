package com.example.android.musicapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FamousJazz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_jazz);

        TextView singer1=(TextView)findViewById(R.id.ScottJoplin);
        singer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Scott_Joplin";
                Intent scott = new Intent(Intent.ACTION_VIEW);
                scott.setData(Uri.parse(url));
                startActivity(scott);
            }
        });
        TextView buddy=(TextView)findViewById(R.id.buddy);
        buddy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Buddy_Bolden";
                Intent buddy = new Intent(Intent.ACTION_VIEW);
                buddy.setData(Uri.parse(url));
                startActivity(buddy);
            }
        });

        TextView Ducky=(TextView)findViewById(R.id.DukeEllington);
        Ducky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Duke_Ellington";
                Intent Ducky = new Intent(Intent.ACTION_VIEW);
                Ducky.setData(Uri.parse(url));
                startActivity(Ducky);

            }
        });
    }
}
