package com.example.android.musicapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class FamousRock extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView SpencerAlbee = (TextView) findViewById(R.id.SpencerAlbee);

        setContentView(R.layout.activity_famous_rock);
        TextView firstSpencerAlbee=(TextView)findViewById(R.id.SpencerAlbee);
        firstSpencerAlbee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Spencer_Albee";
                Intent firstRock = new Intent(Intent.ACTION_VIEW);
                firstRock.setData(Uri.parse(url));
                startActivity(firstRock);
            }
        });
        TextView ScondRockSinger=(TextView)findViewById(R.id.KrisAllen);
        ScondRockSinger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Kris_Allen";
                Intent ScondRock = new Intent(Intent.ACTION_VIEW);
                ScondRock.setData(Uri.parse(url));
                startActivity(ScondRock);
            }
        });
        TextView ThirdRockSigner=(TextView)findViewById(R.id.SaraBareilles);
        ThirdRockSigner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Sara_Bareilles";
                Intent TirdRock = new Intent(Intent.ACTION_VIEW);
                TirdRock.setData(Uri.parse(url));
                startActivity(TirdRock);
            }
        });


    }

}
