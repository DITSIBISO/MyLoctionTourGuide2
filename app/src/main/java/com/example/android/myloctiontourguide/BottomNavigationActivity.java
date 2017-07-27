package com.example.android.myloctiontourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class BottomNavigationActivity extends AppCompatActivity {

    private TextView mTextMessage;
    View view;
    Context context = this;
    LayoutInflater layoutInflater = null;
    FrameLayout content;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    view = null;
                    content.removeAllViews();
                    layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    view = layoutInflater.inflate(R.layout.activity_publicplaces,null);
                    content.addView(view);
                   //mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    view = null;
                    content.removeAllViews();
                    layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    view = layoutInflater.inflate(R.layout.activity_resturants,null);
                    content.addView(view);
                    //mTextMessage.setText(R.string.title_home);
                    //mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    view = null;
                    content.removeAllViews();
                    layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    view = layoutInflater.inflate(R.layout.activity_events,null);
                    content.addView(view);
                    //mTextMessage.setText(R.string.title_home);
                    mTextMessage.setText(R.string.title_notifications);
                    return true;


                case R.id.navigation_manage:
                    view = null;
                    content.removeAllViews();
                    layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    view = layoutInflater.inflate(R.layout.activity_ziwaphi,null);
                    content.addView(view);
                    //mTextMessage.setText(R.string.title_home);
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        //mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        content= (FrameLayout) findViewById(R.id.content);
         view = null;
        layoutInflater = null;
        content.removeAllViews();

    }

}
