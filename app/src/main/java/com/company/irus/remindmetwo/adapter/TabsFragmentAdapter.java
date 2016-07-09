package com.company.irus.remindmetwo.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.company.irus.remindmetwo.fragment.AbstractTabFragment;
import com.company.irus.remindmetwo.fragment.BirthdaysFragment;
import com.company.irus.remindmetwo.fragment.HistoryFragment;
import com.company.irus.remindmetwo.fragment.IdeasFragment;
import com.company.irus.remindmetwo.fragment.TodoFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by iRus on 7/7/2016.
 */
public class TabsFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabMap(context);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdaysFragment.getInstance(context));
    }
}
