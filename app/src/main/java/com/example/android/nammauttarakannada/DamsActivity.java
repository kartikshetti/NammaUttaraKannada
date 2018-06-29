package com.example.android.nammauttarakannada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DamsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cards_display);

        ArrayList<Destination> destinationList=new ArrayList<Destination>();
        destinationList.add(new Destination("Supa","Dandeli",R.drawable.supa,"Supa+dam"));
        destinationList.add(new Destination("Kadra","Kadra",R.drawable.kadra,"Kadra+dam"));

        RecyclerView recyclerview=(RecyclerView)findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager  layoutManager=new GridLayoutManager(this,2);
        recyclerview.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter=new DestinationAdapter(this,destinationList);
        recyclerview.setAdapter(adapter);
    }
}
