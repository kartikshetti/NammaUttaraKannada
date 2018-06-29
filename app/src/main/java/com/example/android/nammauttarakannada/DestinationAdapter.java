package com.example.android.nammauttarakannada;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DestinationAdapter extends RecyclerView.Adapter<DestinationAdapter.DestinationViewHolder> {

    private ArrayList<Destination>mDestinationList=new ArrayList<>();
    private Context mContext;

    public DestinationAdapter(Context context,ArrayList<Destination> destinationList){
        mContext=context;
        mDestinationList=destinationList;
    }

    public class DestinationViewHolder extends RecyclerView.ViewHolder{
        public int currentItem;
        public ImageView image,overflowmenu;
        public TextView name,place;
        public DestinationViewHolder(View itemView){
            super(itemView);
            image=(ImageView)itemView.findViewById(R.id.image);
            name=(TextView)itemView.findViewById(R.id.name);
            place=(TextView)itemView.findViewById(R.id.place);
            overflowmenu=(ImageView)itemView.findViewById(R.id.options_menu);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position=getAdapterPosition();
                    Toast.makeText(mContext,"item click at"+position,Toast.LENGTH_SHORT).show();
                }
            });

        }
    }

    @NonNull
    @Override
    public DestinationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        DestinationViewHolder viewHolder=new DestinationViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final DestinationViewHolder holder, int position) {
        Destination destination=mDestinationList.get(position);
        holder.name.setText(destination.getName());
        holder.place.setText(destination.getPlace());
        holder.image.setImageResource(destination.getImageResourceId());
        final String query=destination.getmQueryString();
        holder.overflowmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupMenu(holder.overflowmenu, query);
            }
        });
    }

    private void showPopupMenu(View view,String query){
        PopupMenu popup=new PopupMenu(mContext,view);
        MenuInflater inflater=popup.getMenuInflater();
        inflater.inflate(R.menu.menu,popup.getMenu());
        popup.setOnMenuItemClickListener(new MyMenuItemClickListener(query));
        popup.show();
    }

    class MyMenuItemClickListener implements PopupMenu.OnMenuItemClickListener{
        String mquery;
        public MyMenuItemClickListener(String query){
            mquery=query;


        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()){
                case R.id.add_favourite:
                    Toast.makeText(mContext,"Added to Favourites list",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.location:

                    if(mquery==null){
                        Toast.makeText(mContext,"Contact locals for info on how to get here",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Uri gmmIntentUri = Uri.parse("geo:0,0?q="+mquery);
                        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                        mapIntent.setPackage("com.google.android.apps.maps");
                        if (mapIntent.resolveActivity(mContext.getPackageManager()) != null) {
                            mContext.startActivity(mapIntent);
                        }
                    }
                    default:


            }
            return false;
        }
    }

    @Override
    public int getItemCount() {
        return mDestinationList.size();
    }
}
