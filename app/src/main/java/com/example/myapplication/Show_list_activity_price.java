package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Show_list_activity_price extends AppCompatActivity {
    private ListView lvProduct2;
    private Product_Adapter adapter2;
    public List<Product> mProductList2;
    public static Product nextActivityProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list_price);
        //////////////////////////////////////////////////не трогать загружает список из пред активити
        mProductList2 = new ArrayList<>();
        mProductList2 = Show_list_activity.mProductList;
        lvProduct2 = (ListView)findViewById(R.id.listview_product2);
        adapter2 = new Product_Adapter(getApplicationContext(), mProductList2);
        lvProduct2.setAdapter(adapter2);
        //////////////////////////////////////////////////
        lvProduct2.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        nextActivityProduct = mProductList2.get(i);
                        Intent intent = new Intent(Show_list_activity_price.this, FullInfoActivity.class);
                        startActivity(intent);
                    }
                }
        );












    }
}
