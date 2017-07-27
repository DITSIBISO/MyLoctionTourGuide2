package com.example.android.myloctiontourguide;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import static android.os.Build.VERSION_CODES.M;

public class PublicplacesActivity extends AppCompatActivity {
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        RecyclerView recList = (RecyclerView) findViewById(R.id.cardList);

        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        List<Contact> contactList = new ArrayList<>();
        Contact contact1 = new Contact();
        contact1.setEmail("ditsibisomasete@gmail.com");
        contact1.setName("Valenciah");
        contact1.setTitle("MS");


        Contact contact2 = new Contact();
        contact2.setEmail("ditsibisomasete@gmail.com");
        contact2.setName("Valenciah");
        contact2.setTitle("MS");



        contactList.add(contact1);
        contactList.add(contact1);


        adapter = new MyAdapter(this, contactList);
        recList.setAdapter(adapter);

    }
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            Intent intent = new Intent(this, PublicplacesActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(this, EventsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_slideshow) {
            Intent intent = new Intent(this, ResturantsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_manage) {
            Intent intent = new Intent(this, ZiwaphiActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_share) {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setType("text/plain");
            intent.putExtra(intent.EXTRA_SUBJECT, "Try our new Tembisa tour guide");
            intent.putExtra(intent.EXTRA_TEXT, "www.mylocationtour.co.za");
            Intent mailer = Intent.createChooser(intent, null);
            startActivity(mailer);

        } else if (id == R.id.nav_send) {
        } else  if (id == R.id.action_settings){
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
            return true;

        }
    return super.onOptionsItemSelected(item);
    }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.activity_main_drawer, menu);
            return true;
        }
}


