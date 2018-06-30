package com.example.android.nammauttarakannada;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**the navigation drawer should appear in front of the app bar (as shown in figure 1), not below it.
         *  To make that happen, you need to use Toolbar as your app bar, instead of using a theme with a built-in app bar.
         *
         *  To apply the toolbar as the app bar. Then call
         *  setSupportActionBar() and pass the Toolbar object**/
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /**Enable the app bar's "home" button by calling setDisplayHomeAsUpEnabled(true), and
         then change it to use the menu icon by calling setHomeAsUpIndicator(int)**/
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.baseline_menu_white_24);

        /**To receive callbacks when the user taps a list item in the drawer, implement the OnNavigationItemSelectedListener
         *  interface and attach it to your NavigationView by calling setNavigationItemSelectedListener().**/

        mDrawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setChecked(true);
                mDrawerLayout.closeDrawers();

                /**code here to update the UI based on the item selected**/
                switch (item.getItemId()) {
                    case R.id.nav_beaches:
                        Intent beaches = new Intent(MainActivity.this, BeachesActivity.class);
                        startActivity(beaches);
                        return true;

                    case R.id.nav_caves:
                        Intent caves = new Intent(MainActivity.this, CavesActivity.class);
                        startActivity(caves);
                        return true;

                    case R.id.nav_dams:
                        Intent dams = new Intent(MainActivity.this, DamsActivity.class);
                        startActivity(dams);
                        return true;


                    case R.id.nav_forts:
                        Intent forts = new Intent(MainActivity.this, FortsActivity.class);
                        startActivity(forts);
                        return true;


                    case R.id.nav_islands:
                            Intent islands=new Intent(MainActivity.this,IslandsActivity.class);
                            startActivity(islands);
                             return true;


                    case R.id.nav_parks:
                        Intent parks=new Intent(MainActivity.this,ParksActivity.class);
                        startActivity(parks);
                        return true;


                    case R.id.nav_temples:
                        Intent temples=new Intent(MainActivity.this,TemplesActivity.class);
                        startActivity(temples);
                        return true;


                    case R.id.nav_waterfalls:
                        Intent waterfalls=new Intent(MainActivity.this,WaterfallsActivity.class);
                        startActivity(waterfalls);
                        return true;


                    case R.id.nav_others:
                        Intent others=new Intent(MainActivity.this,OthersActivity.class);
                        startActivity(others);
                        return true;





                }
                return true;
            }
        });
        //Find all the textviews in the layout

        TextView beaches = (TextView) findViewById(R.id.beaches);
        TextView caves = (TextView) findViewById(R.id.caves);
        TextView dams = (TextView) findViewById(R.id.dams);
        TextView forts = (TextView) findViewById(R.id.forts);
        TextView islands = (TextView) findViewById(R.id.islands);
        TextView parks = (TextView) findViewById(R.id.parks);
        TextView temples = (TextView) findViewById(R.id.temples);
        TextView waterfalls = (TextView) findViewById(R.id.waterfalls);
        TextView others = (TextView) findViewById(R.id.others);

        //Attach clicklisteners to all the textviews to start corresponding activity

        beaches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent beaches = new Intent(MainActivity.this, BeachesActivity.class);
                startActivity(beaches);
            }
        });

        caves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent caves = new Intent(MainActivity.this, CavesActivity.class);
                startActivity(caves);
            }
        });

        dams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dams = new Intent(MainActivity.this, DamsActivity.class);
                startActivity(dams);
            }
        });

        forts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forts = new Intent(MainActivity.this, FortsActivity.class);
                startActivity(forts);
            }
        });

        islands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent islands = new Intent(MainActivity.this, IslandsActivity.class);
                startActivity(islands);
            }
        });

        temples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent temples = new Intent(MainActivity.this, TemplesActivity.class);
                startActivity(temples);
            }
        });

        parks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent parks = new Intent(MainActivity.this, ParksActivity.class);
                startActivity(parks);
            }
        });

        waterfalls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent waterfalls = new Intent(MainActivity.this, WaterfallsActivity.class);
                startActivity(waterfalls);
            }
        });

        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent others = new Intent(MainActivity.this, OthersActivity.class);
                startActivity(others);
            }
        });

    }

    /**
     * To open the drawer when the user taps on the nav drawer button, override onOptionsItemSelected()
     * <p>
     * to hook into the options menu framework and listen for when the user taps the item with the ID android.R.id.home
     **/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}


