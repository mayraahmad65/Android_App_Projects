package com.example.ahmedpc.listviewtask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BaseAdapterTask extends BaseAdapter {

    String[] stringname;
    String[] stringtype;
    int[] imagevieww;
    Context index;

    public BaseAdapterTask (Context context,String[] strname,String[] strIndex,int[] imgv){
        index = context;
        stringname = strname;
        stringtype = strIndex;
        imagevieww = imgv;
    }


    @Override
    public int getCount() {
        return stringname.length;
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
        view = inflater.inflate(R.layout.rowsbasic,null);
        final TextView index = view.findViewById(R.id.tv_names);
        final TextView name = view.findViewById(R.id.tv_type);
        ImageView imageView = view.findViewById(R.id.iv_background);
        index.setText(stringname[i]);
        name.setText(stringtype[i]);
        imageView.setImageResource(imagevieww[i]);
        return view;
    }
}
