package com.example.android.nammauttarakannada;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class OthersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cards_display);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /**Enable the app bar's "home" button by calling setDisplayHomeAsUpEnabled(true), and
         then change it to use the menu icon by calling setHomeAsUpIndicator(int)**/
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        ArrayList<Destination> destinationList=new ArrayList<Destination>();
        destinationList.add(new Destination("Warship Museum","Karwar",R.drawable.warship_museum,"Warship+museum"));
        destinationList.add(new Destination("Syntheri Rocks","Dandeli",R.drawable.syntheri,"Syntheri+rocks"));



        RecyclerView recyclerview=(RecyclerView)findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager  layoutManager=new GridLayoutManager(this,2);
        recyclerview.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter=new DestinationAdapter(this,destinationList);
        recyclerview.setAdapter(adapter);

    }
}
