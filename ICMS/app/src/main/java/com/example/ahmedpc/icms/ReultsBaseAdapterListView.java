package com.example.ahmedpc.icms;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by AHMED PC on 12/16/2018.
 */

public class ReultsBaseAdapterListView extends BaseAdapter {

    int[] imagevieww;
    Context index;

    public ReultsBaseAdapterListView (Context context,int[] imgv){
        index = context;
        imagevieww = imgv;
    }


    @Override
    public int getCount() {
        return imagevieww.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(index);
        view = inflater.inflate(R.layout.row_basic,null);
        ImageView imageView = view.findViewById(R.id.icms_iv_list);
        imageView.setImageResource(imagevieww[i]);
        return view;
    }
}
