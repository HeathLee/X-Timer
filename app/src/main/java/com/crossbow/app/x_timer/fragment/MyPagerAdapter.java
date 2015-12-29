package com.crossbow.app.x_timer.fragment;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.crossbow.app.x_timer.MainActivity;

/**
 * Created by CuiH on 2015/12/29.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3" };
    private MainActivity mainActivity;

    public MyPagerAdapter(FragmentManager fm, MainActivity activity) {
        super(fm);
        mainActivity = activity;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MyFragment1(mainActivity);
        } else if (position == 1) {
            return new MyFragment2();
        } else if (position == 2) {
            return new MyFragment3();
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}