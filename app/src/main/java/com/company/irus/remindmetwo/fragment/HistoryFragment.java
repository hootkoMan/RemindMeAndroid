package com.company.irus.remindmetwo.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.company.irus.remindmetwo.R;
import com.company.irus.remindmetwo.adapter.RemindListAdapter;
import com.company.irus.remindmetwo.dto.RemindDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iRus on 7/7/2016.
 */
public class HistoryFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.fragment_history;

    public static HistoryFragment getInstance(Context context) {
        Bundle args = new Bundle();
        HistoryFragment fragment = new HistoryFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_navigation_history));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recycleView);
        rv.setLayoutManager(new LinearLayoutManager(context));
        rv.setAdapter(new RemindListAdapter(createMockRemindListData()));

        return view;
    }

    private List<RemindDTO> createMockRemindListData() {
        List<RemindDTO> data = new ArrayList<>();
        data.add(new RemindDTO("item 1"));
        data.add(new RemindDTO("item 2"));
        data.add(new RemindDTO("item 3"));
        data.add(new RemindDTO("item 4"));
        data.add(new RemindDTO("item 5"));
        data.add(new RemindDTO("item 6"));
        return data;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
