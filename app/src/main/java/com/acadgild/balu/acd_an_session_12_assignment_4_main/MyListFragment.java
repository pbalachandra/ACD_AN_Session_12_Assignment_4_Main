package com.acadgild.balu.acd_an_session_12_assignment_4_main;

import android.app.ListFragment;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BALU on 6/15/2016.
 */
public class MyListFragment extends ListFragment implements AdapterView.OnItemClickListener {
    String[] appTitles;
    TypedArray appLogos;

    CustomAdapter customAdapter;

    private List<AppList> appList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.list_fragment, null, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        appTitles = getResources().getStringArray(R.array.titles);
        appLogos = getResources().obtainTypedArray(R.array.logos);

        appList = new ArrayList<AppList>();

        for (int i = 0; i < appTitles.length; i++) {
            AppList apps = new AppList(appTitles[i], appLogos.getResourceId(i, -1));

            appList.add(apps);
        }

        customAdapter = new CustomAdapter(getActivity(), appList);
        setListAdapter(customAdapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        Toast.makeText(getActivity(), appTitles[position], Toast.LENGTH_SHORT).show();

    }
}
