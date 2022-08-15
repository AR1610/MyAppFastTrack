package com.myappfasttrack.activity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.myappfasttrack.A_Fragment;
import com.myappfasttrack.B_Fragment;

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    int tabCount;
    public MyPagerAdapter(FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager);

        this.tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                A_Fragment aFragment = new A_Fragment();
                return aFragment;
            case 1:
                B_Fragment bFragment = new B_Fragment();
                return  bFragment;
            case 2:
                A_Fragment aFragment1 = new A_Fragment();
                return  aFragment1;

        }
        return null;
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
