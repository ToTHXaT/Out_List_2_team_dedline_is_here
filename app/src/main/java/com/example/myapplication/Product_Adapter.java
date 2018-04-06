//package com.example.myapplication;
//
//import android.content.Context;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.EditText;
//import android.widget.TextView;
//
//import java.util.List;
//
///**
// * Created by Ainur on 03.04.2018.
// */
//
//public class Product_Adapter extends BaseAdapter {
//
//
//    private Context mContext;
//    private List<Product> mProductList;
//
//    //Constructor
//
//    public Product_Adapter(Context mContext, List<Product> mProductList) {
//        this.mContext = mContext;
//        this.mProductList = mProductList;
//    }
//
//    @Override
//    public int getCount() {
//        return mProductList.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return mProductList.get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return mProductList.get(position).getId();
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        View v = View.inflate(mContext, R.layout.product_list_medicines, null);
//        TextView id = (TextView)v.findViewById(R.id.Id);
//        TextView name = (TextView)v.findViewById(R.id.Name);
//        EditText count = (EditText) v.findViewById(R.id.value_price);
//        //Set text for TextView
//        id.setText(mProductList.get(position).getName());
//        name.setText(String.valueOf(mProductList.get(position).getPrice()));
//        //count.setText(mProductList.get(position).getDistance());
//
//        //Save product id to tag
//        v.setTag(mProductList.get(position).getId());
//
//        return v;
//    }
//
//
//
//
//
//
//}
