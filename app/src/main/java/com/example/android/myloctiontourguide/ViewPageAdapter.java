package com.example.android.myloctiontourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by eKasiLab Alex CDTB on 2017/07/20.
 */

public class ViewPageAdapter extends FragmentPagerAdapter {
    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
        {
            fragment = new FragmentCaprive();
        }
        else if (position == 1)
        {
            fragment = new FragmentMacdonald();
        }
        else if (position == 2)
        {
            fragment = new FragmentSpringBash();
        }

        else if (position == 3)
        {
            fragment = new FragmentMoritingPark();
        }
        else if (position == 4)
        {
            fragment = new Fragment();
        }
        return fragment;

    }

    @Override
    public int getCount() {
        return 5;

    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0)
        {
            title = "Public Places";
        }
        else if (position == 1)
        {
            title = "Restaurants";
        }
        else if (position == 2)
        {
            title = "Events";
        }
        else if (position == 3)
        {
            title = "Secret Places";
        }
        else if (position == 4)
        {
            title = "Ziwaphi";
        }
        return title;
    }
}
