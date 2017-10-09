package com.example.santosh.starting;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

/**
 * Created by santosh on 10/7/2017.
 */

public class MpagerAdapter extends PagerAdapter {
    private int[] layouts;
    private LayoutInflater layoutInflater;
    private Context context;

        public MpagerAdapter(int []layouts,Context context)
        {
            this.layouts=layouts;
            this.context=context;
            layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        // default methods in PagerAdapter
        public int getCount() {
        return layouts.length;
    }

    @Override
    // it is too default method
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view=layoutInflater.inflate(layouts[position],container,false);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view=(View)object;
        container.removeView(view);
    }
}
