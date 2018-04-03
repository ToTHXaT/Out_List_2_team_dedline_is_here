package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

public class Show_list_activity extends AppCompatActivity {
    private ListView lvProduct;
    private ProductListAdapter adapter;
    private List<Product> mProductList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list_activity);

        ProgressBar prbr = (ProgressBar) findViewById(R.id.progressBar);
        prbr.setVisibility(ProgressBar.VISIBLE);
        prbr.getIndeterminateDrawable().setColorFilter(0xFF5C5CFF, android.graphics.PorterDuff.Mode.MULTIPLY);

        lvProduct = (ListView)findViewById(R.id.listview_product);

        mProductList = new ArrayList<>();
        //Add sample data for list

        for (int i = 0; i < 100; i++)
        {
            mProductList.add(new Product(i , String.valueOf(i)+"aaaaaaaaaa",String.valueOf(i + 1)+"bbbbbbbbbb", String.valueOf(i + 2)+"cccccccccc"));
        }


        //Init adapter
        adapter = new ProductListAdapter(getApplicationContext(), mProductList);
        lvProduct.setAdapter(adapter);





    }
}
