package com.example.ahmedpc.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ahmedpc.gridview.R;

/**
 * Created by AHMED PC on 11/17/2018.
 */

public class GridViewAdapter extends BaseAdapter {


    private Context mContext;
    private String[] stringtype;
    String[] stringname;
    private int[] gridviewimage;

    public GridViewAdapter (Context context,String[] strname,String[] strIndex, int[] viewimage){
        mContext = context;
        stringname = strname;
        stringtype = strIndex;
        gridviewimage = viewimage;
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
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        View gridViewAndroid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            gridViewAndroid = new View(mContext);
            gridViewAndroid = inflater.inflate(R.layout.customgridview, null);


        } else {
            gridViewAndroid = (View) convertView;
        }
        TextView tv = (TextView) gridViewAndroid.findViewById(R.id.tv_name);
        TextView tvingredients = gridViewAndroid.findViewById(R.id.tv_ingredients);
        ImageView iv = (ImageView) gridViewAndroid.findViewById(R.id.iv_pic);
        tv.setText(stringname[i]);
        tvingredients.setText(stringtype[i]);
        iv.setImageResource(gridviewimage[i]);

        return gridViewAndroid;
    }
}
