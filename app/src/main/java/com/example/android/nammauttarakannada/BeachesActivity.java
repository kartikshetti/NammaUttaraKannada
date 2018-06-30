package com.example.android.nammauttarakannada;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class BeachesActivity extends AppCompatActivity {

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
        destinationList.add(new Destination("Devbag","Karwar",R.drawable.devbag_beach,"Devbag+beach"));
        destinationList.add(new Destination("Gokarna","Gokarna",R.drawable.gokarna_beach,"Gokarna+beach"));
        destinationList.add(new Destination("Half moon","Gokarna",R.drawable.halfmoon_beach,"Half+moon+beach"));
        destinationList.add(new Destination("Kudle","Gokarna",R.drawable.kudle_beach,"Kudle+beach"));
        destinationList.add(new Destination("Om","Gokarna",R.drawable.om_beach,"Om+beach"));
        destinationList.add(new Destination("Paradise","Gokarna",R.drawable.paradise_beach,"Paradise+beach"));
        destinationList.add(new Destination("Rabindranath Tagore","Gokarna",R.drawable.rabindranath_tagore_beach,"Rabindranath+Tagore+beach"));






        RecyclerView recyclerview=(RecyclerView)findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager  layoutManager=new GridLayoutManager(this,2);
        recyclerview.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter=new DestinationAdapter(this,destinationList);
        recyclerview.setAdapter(adapter);


    }
}
