package com.example.android.nammauttarakannada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find all the textviews in the layout

        TextView beaches=(TextView)findViewById(R.id.beaches);
        TextView caves=(TextView)findViewById(R.id.caves);
        TextView dams=(TextView)findViewById(R.id.dams);
        TextView forts=(TextView)findViewById(R.id.forts);
        TextView islands=(TextView)findViewById(R.id.islands);
        TextView parks=(TextView)findViewById(R.id.parks);
        TextView temples=(TextView)findViewById(R.id.temples);
        TextView waterfalls=(TextView)findViewById(R.id.waterfalls);
        TextView others=(TextView)findViewById(R.id.others);

        //Attach clicklisteners to all the textviews to start corresponding activity

        beaches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent beaches=new Intent(MainActivity.this,BeachesActivity.class);
                startActivity(beaches);
            }
        });

        caves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent caves=new Intent(MainActivity.this,CavesActivity.class);
                startActivity(caves);
            }
        });

        dams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dams=new Intent(MainActivity.this,DamsActivity.class);
                startActivity(dams);
            }
        });

        forts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forts=new Intent(MainActivity.this,FortsActivity.class);
                startActivity(forts);
            }
        });

        islands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent islands=new Intent(MainActivity.this,IslandsActivity.class);
                startActivity(islands);
            }
        });

        temples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent temples=new Intent(MainActivity.this,TemplesActivity.class);
                startActivity(temples);
            }
        });

        parks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent parks=new Intent(MainActivity.this,ParksActivity.class);
                startActivity(parks);
            }
        });

        waterfalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent waterfalls=new Intent(MainActivity.this,WaterfallsActivity.class);
                startActivity(waterfalls);
            }
        });

        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent others=new Intent(MainActivity.this,OthersActivity.class);
                startActivity(others);
            }
        });











    }
}
