package com.example.android.nammauttarakannada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class WaterfallsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cards_display);

        ArrayList<Destination> destinationList=new ArrayList<Destination>();
        destinationList.add(new Destination("Magod Falls","Yellapura",R.drawable.magod,"Magod+Falls"));
        destinationList.add(new Destination("Vibhoti Falls","Near Yana",R.drawable.vibhoti,"Vibhoti+falls"));
        destinationList.add(new Destination("Unchalli Falls","sirsi",R.drawable.unchalli,"Unchalli+falls"));
        destinationList.add(new Destination("Sathodi Falls","Yellapura",R.drawable.sathodi,"Sathodi+falls"));
        destinationList.add(new Destination("Apasarakonda Falls","Honnavar",R.drawable.apsarakonda,"Apsarakonda+falls"));


        RecyclerView recyclerview=(RecyclerView)findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager  layoutManager=new GridLayoutManager(this,2);
        recyclerview.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter=new DestinationAdapter(this,destinationList);
        recyclerview.setAdapter(adapter);

    }
}
