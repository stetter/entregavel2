package com.stetter.entregavel2.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

public class FragmentPageAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> listaFragments;

    public FragmentPageAdapter(FragmentManager fm, List<Fragment> listaFragments) {
        super(fm);
        this.listaFragments = listaFragments;
    }

    @Override
    public Fragment getItem(int position) {
        return this.listaFragments.get(position);
    }

    @Override
    public int getCount() {
        return this.listaFragments.size();
    }
}
