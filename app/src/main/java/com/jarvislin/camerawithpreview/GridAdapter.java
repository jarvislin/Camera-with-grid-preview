package com.jarvislin.camerawithpreview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;

/**
 * Created by Jarvis Lin on 2015/5/4.
 */
public class GridAdapter extends BaseAdapter {

    private ArrayList<String>list;
    private Context context;
    public GridAdapter(ArrayList<String> list, Context context){
        this.list =list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder holder;

        if(convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false);
            holder = new ViewHolder();

            //find views
            holder.image = (GridItemView) view.findViewById(R.id.img);
            view.setTag(holder);

        } else {
            holder = (ViewHolder) view.getTag();
        }

        ImageLoader.getInstance().displayImage(list.get(position), holder.image);

        return view;
    }

    private class ViewHolder {
        GridItemView image;
    }
}
