package com.example.janani.PregnantLadyTabs;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


import com.example.janani.PregnantLadyTabs.BabyTabs.BabyCalendarActivity;
import com.example.janani.PregnantLadyTabs.BabyTabs.BabyDangerActivity;
import com.example.janani.PregnantLadyTabs.BabyTabs.BabyHelpLineActivity;
import com.example.janani.PregnantLadyTabs.BabyTabs.BabyImmunisationActivity;
import com.example.janani.PregnantLadyTabs.BabyTabs.BabyInformationActivity;
import com.example.janani.PregnantLadyTabs.BabyTabs.BabyMustKnowsActivity;
import com.example.janani.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class BabyActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_baby);
        Toolbar toolbar = findViewById (R.id.toolbar);
        setSupportActionBar (toolbar);

        FloatingActionButton fab = findViewById (R.id.fab);
        fab.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                Snackbar.make (view, "Chat Assistance", Snackbar.LENGTH_LONG)
                        .setAction ("Action", null).show ( );
            }
        });

        DrawerLayout drawer = findViewById (R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle (
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener (toggle);
        toggle.syncState ( );

        NavigationView navigationView = findViewById (R.id.nav_view);
        navigationView.setNavigationItemSelectedListener (this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById (R.id.drawer_layout);
        if (drawer.isDrawerOpen (GravityCompat.START)) {
            drawer.closeDrawer (GravityCompat.START);
        } else {
            super.onBackPressed ( );
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater ( ).inflate (R.menu.baby, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId ( );

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected (item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId ( );

        if (id == R.id.nav_c) {
            startActivity (new Intent(this, BabyInformationActivity.class));
        } else if (id == R.id.nav_camera) {
            startActivity (new Intent (this, BabyImmunisationActivity.class));

        } else if (id == R.id.nav_gallery) {
            startActivity (new Intent (this, BabyMustKnowsActivity.class));

        } else if (id == R.id.nav_slideshow) {
            startActivity (new Intent (this, BabyDangerActivity.class));

        }
        else if (id == R.id.nav_manage) {
            startActivity (new Intent (this, BabyHelpLineActivity.class));

        }

        else if (id == R.id.nav_ma) {
            startActivity (new Intent (this, BabyCalendarActivity.class));

        }

        DrawerLayout drawer = findViewById (R.id.drawer_layout);
        drawer.closeDrawer (GravityCompat.START);
        return true;
    }
}
