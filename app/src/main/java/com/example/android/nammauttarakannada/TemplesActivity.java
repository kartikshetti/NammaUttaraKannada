package com.example.android.nammauttarakannada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class TemplesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cards_display);

        ArrayList<Destination> destinationList=new ArrayList<Destination>();
        destinationList.add(new Destination("Madukeshwara Temple","Banavasi",R.drawable.madukeshwara,"Madukeshwara+temple+banavasi"));
        destinationList.add(new Destination("Mahabaleshwara Temple","Gokarna",R.drawable.maahbaleshwar,"Mahabaleshwar+temple+Gokarna"));
        destinationList.add(new Destination("Sejjeshwara Temple","Karwar",R.drawable.sejjeshwar,"Sejjeshwar+temple+Karwar"));
        destinationList.add(new Destination("Marikamba Temple","Sirsi",R.drawable.marikamaba,"Marikamba+temple+Sirsi"));
        destinationList.add(new Destination("Shiva Temple","Murdeshwar",R.drawable.murdeshwar,"Shiva+temple+Murdeshwar"));


        RecyclerView recyclerview=(RecyclerView)findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager  layoutManager=new GridLayoutManager(this,2);
        recyclerview.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter=new DestinationAdapter(this,destinationList);
        recyclerview.setAdapter(adapter);
    }
}
