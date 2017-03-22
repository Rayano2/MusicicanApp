package com.example.android.musicapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class FsmousClassic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fsmous_classic);

        TextView Antonio_Vivaldi=(TextView)findViewById(R.id.AntonioVivaldi);
        Antonio_Vivaldi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/Antonio_Vivaldi";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        TextView johan =(TextView)findViewById(R.id.JohannSebastianBach);

        johan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://en.wikipedia.org/wiki/Johann_Sebastian_Bach";
                Intent johaninformation = new Intent(Intent.ACTION_VIEW);
                johaninformation.setData(Uri.parse(url));
                startActivity(johaninformation);

            }
        });


        TextView gorge =(TextView)findViewById(R.id.GeorgeFridericHandel);

        gorge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://en.wikipedia.org/wiki/George_Frideric_Handel";
                Intent gorgeinformation = new Intent(Intent.ACTION_VIEW);
                gorgeinformation.setData(Uri.parse(url));
                startActivity(gorgeinformation);
            }
        });

    }
}
