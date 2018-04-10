package com.example.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ListAptekAdapter extends BaseAdapter {

    private Context mContext;
    private List<Apteki> mApteki;

    //Constructor

    public ListAptekAdapter(Context mContext, List<Apteki> mApteki) {
        this.mContext = mContext;
        this.mApteki = mApteki;
    }

    @Override
    public int getCount() {
        return mApteki.size();
    }

    @Override
    public Object getItem(int position) {
        return mApteki.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.list_aptek_lay, null);

        TextView tvName = (TextView)v.findViewById(R.id.nameApteka);
        TextView tvAddress = (TextView)v.findViewById(R.id.addrApteka);
        TextView tvPrice = (TextView)v.findViewById(R.id.priceApteka);

        tvName.setText(mApteki.get(position).getName());
        tvAddress.setText(String.valueOf(mApteki.get(position).getAddress()));
        tvPrice.setText(mApteki.get(position).getPrice());

        return v;
    }
}