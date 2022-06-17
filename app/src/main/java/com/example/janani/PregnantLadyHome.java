package com.example.janani;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.janani.PregnantLadyTabs.BabyActivity;
import com.example.janani.PregnantLadyTabs.CalendarActivity;
import com.example.janani.PregnantLadyTabs.DangerActivity;
import com.example.janani.PregnantLadyTabs.HelpLineActivity;
import com.example.janani.PregnantLadyTabs.MustKnowActivity;
import com.example.janani.PregnantLadyTabs.PersonalDetails;
import com.example.janani.PregnantLadyTabs.RiskAssessment;
import com.example.janani.PregnantLadyTabs.ToDoActivity;
import com.example.janani.PregnantLadyTabs.VideosActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class PregnantLadyHome extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_pregnant_lady_home);
        Toolbar toolbar = findViewById (R.id.toolbar);
        setSupportActionBar (toolbar);

        FloatingActionButton fab = findViewById (R.id.fab);
        fab.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                Snackbar.make (view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction ("Action", null).show ( );
            }
        });

        DrawerLayout drawer = findViewById (R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle (
                this, drawer,toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
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
        System.out.print("INFALTEEE");
        getMenuInflater ( ).inflate (R.menu.pregnant_lady, menu);
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

        Log.v(TAG, String.valueOf(id));


        if (id == R.id.menu_personal_details) {
            startActivity (new Intent(this, PersonalDetails.class));
        }
        else if (id == R.id.menu_risk_assessment) {
            startActivity (new Intent (this, RiskAssessment.class));
        } else if (id == R.id.menu_todolist) {
            startActivity (new Intent (this, ToDoActivity.class));
        }
        else if (id == R.id.menu_danger) {
            startActivity (new Intent (this, DangerActivity.class));

        } else if (id == R.id.menu_must_know) {
            startActivity (new Intent (this, MustKnowActivity.class));

        } else if (id == R.id.menu_baby) {
            startActivity (new Intent (this, BabyActivity.class));
        }
        else if(id==R.id.menu_helpline) {
            startActivity (new Intent (this, HelpLineActivity.class));
        }

        else if(id==R.id.menu_calender) {
            startActivity (new Intent (this, CalendarActivity.class));
        }
        else if(id==R.id.menu_video) {
            startActivity (new Intent (this, VideosActivity.class));
        }

        DrawerLayout drawer = findViewById (R.id.drawer_layout);
        drawer.closeDrawer (GravityCompat.START);
        return true;
    }
}