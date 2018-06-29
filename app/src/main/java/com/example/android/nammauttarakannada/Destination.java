package com.example.android.nammauttarakannada;

public class Destination {

    private String mName;
    private String mPlace;
    private int mImageResourceId;
    private String mQueryString;
    private boolean hasQuery=false;


    public Destination(String name,String place,int imageResid) {
        mName = name;
        mPlace = place;
        mImageResourceId = imageResid;
    }

    public Destination(String name,String place,int imageResid,String queryString){
        mName=name;
        mPlace=place;
        mImageResourceId=imageResid;
        mQueryString=queryString;
    }

    public String getName() {
        return mName;
    }

    public String getPlace() {
        return mPlace;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getmQueryString() {
        return mQueryString;
    }
}
