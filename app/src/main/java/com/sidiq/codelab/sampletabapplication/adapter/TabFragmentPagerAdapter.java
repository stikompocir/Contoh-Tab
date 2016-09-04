package com.sidiq.codelab.sampletabapplication.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sidiq.codelab.sampletabapplication.fragment.Tab1Fragment;
import com.sidiq.codelab.sampletabapplication.fragment.Tab2Fragment;

/**
 * Created by Maman on 30/08/2016.
 */
public class TabFragmentPagerAdapter extends FragmentPagerAdapter {
    //nama tab nya
    String[] title = new String[]{
            "Fragment 1", "Fragment 2"
    };

    public TabFragmentPagerAdapter(FragmentManager fm) {

        super(fm);
    }

    //method ini yang akan memanipulasi penampilan Fragment dilayar
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
           case 0:
               fragment = new Tab1Fragment();
               break;
            case 1:
                fragment = new Tab2Fragment();
                break;
            default:
                fragment = null;
                break;
       }

        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return title.length;
    }
}
