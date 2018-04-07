package com.example.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;


public class ProductListAdapter extends BaseAdapter {

    private Context mContext;
    private List<Product> mProductList;

    //Constructor

    public ProductListAdapter(Context mContext, List<Product> mProductList) {
        this.mContext = mContext;
        this.mProductList = mProductList;
    }

    @Override
    public int getCount() {
        return mProductList.size();
    }

    @Override
    public Object getItem(int position) {
        return mProductList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.product_list_medicines, null);
        TextView tvName = (TextView)v.findViewById(R.id.name);
        TextView tvId = (TextView)v.findViewById(R.id.Id);
        TextView tvKol_vo = (TextView)v.findViewById(R.id.kol_vo);
        //Set text for TextView
        tvName.setText(mProductList.get(position).getName());
        tvId.setText(String.valueOf(mProductList.get(position).getId()));
        tvKol_vo.setText(mProductList.get(position).getKol_vo());

        //Save product id to tag
        v.setTag(mProductList.get(position).getId());

        return v;
    }
}
