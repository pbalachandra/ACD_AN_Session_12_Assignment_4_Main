package com.acadgild.balu.acd_an_session_12_assignment_4_main;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by BALU on 6/15/2016.
 */
public class CustomAdapter extends BaseAdapter
{
    Context context;
    List<AppList> appList;

    public CustomAdapter(Context context, List<AppList> appList)
    {
        this.context = context;
        this.appList = appList;
    }

    @Override
    public int getCount() {
        return appList.size();
    }

    @Override
    public Object getItem(int position) {
        return appList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_item, null);
        }

        ImageView imageView_logo = (ImageView) convertView.findViewById(R.id.imageView_logo);
        TextView textView_title = (TextView) convertView.findViewById(R.id.textView_title);
        TextView textView_desc = (TextView) convertView.findViewById(R.id.textView_desc);

        AppList appList_pos = appList.get(position);

        imageView_logo.setImageResource(appList_pos.getLogo());
        textView_title.setText(appList_pos.getTitle());
        String desc = appList_pos.getTitle() + " description";
        textView_desc.setText(desc);

        return convertView;

    }
}
