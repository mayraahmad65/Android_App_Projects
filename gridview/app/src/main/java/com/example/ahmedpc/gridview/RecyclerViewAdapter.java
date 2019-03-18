package com.example.ahmedpc.gridview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.w3c.dom.Text;

/**
 * Created by AHMED PC on 11/21/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CustomViewHolder> {

    Context context;
    JSONArray arrData;
    RecyclerViewAdapter(Context context, JSONArray arrData) {
        this.context = context;
        this.arrData = arrData;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.customgridview, parent, false);

        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        try {
            holder.imvFood.setImageResource(Integer.parseInt(arrData.getJSONObject(position).getString("imageName")));
            holder.txtName.setText(arrData.getJSONObject(position).getString("name"));
            holder.txtIngredients.setText(arrData.getJSONObject(position).getString("Ingredients"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return arrData.length();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView imvFood;
        TextView txtName,txtIngredients,txtPrice;

        CustomViewHolder(View view) {
            super(view);
            imvFood = view.findViewById(R.id.iv_pic);
            txtName= view.findViewById(R.id.tv_name);
            txtIngredients= view.findViewById(R.id.tv_ingredients);
            txtPrice= view.findViewById(R.id.tv_price);


        }
    }
}
