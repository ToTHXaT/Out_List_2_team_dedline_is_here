package com.example.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;


public class Product_Adapter extends BaseAdapter {

    private Context mContext;
    private List<Product> mProductList;

    //Constructor

    public Product_Adapter(Context mContext, List<Product> mProductList) {
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
        View v = View.inflate(mContext, R.layout.product_list_medicines_price, null);
        TextView tvName = (TextView)v.findViewById(R.id.name2);
        TextView tvId = (TextView)v.findViewById(R.id.Id2);
        TextView tvPrice = (TextView)v.findViewById(R.id.Price2);

        tvName.setText(mProductList.get(position).getName());
        tvId.setText(String.valueOf(mProductList.get(position).getId()));
        tvPrice.setText(mProductList.get(position).getPrice());

        v.setTag(mProductList.get(position).getId());

        return v;
    }
}
