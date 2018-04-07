package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.AdapterView;
import java.util.ArrayList;
import java.util.List;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;


public class Show_list_activity extends AppCompatActivity {
    private ListView lvProduct;
    private ProductListAdapter adapter;
    private List<Product> mProductList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list_activity);

        ProgressBar prbr = (ProgressBar) findViewById(R.id.progressBar);
        prbr.setVisibility(ProgressBar.INVISIBLE);
        prbr.getIndeterminateDrawable().setColorFilter(0xFF5C5CFF, android.graphics.PorterDuff.Mode.MULTIPLY);

        lvProduct = (ListView)findViewById(R.id.listview_product);
        mProductList = new ArrayList<>();
        //Add sample data for list

        //Init adapter
//        adapter = new ProductListAdapter(getApplicationContext(), mProductList);
//        lvProduct.setAdapter(adapter);
    }
    int strtI = 0;
    public void onList3Click(View view){
        Intent intent = new Intent(Show_list_activity.this, FullInfoActivity.class);
        startActivity(intent);
    }
    public void onPlus(View view){
        //mProductList.clear();
        //Add elements
        //Add elements
        //Add elements
        //Add elements
        //Add elements
        //Add elements


//        int i = strtI++;
//        mProductList.add(new Product(i , String.valueOf(i)+"lolololololo","", String.valueOf(i + 2)));

        adapter = new ProductListAdapter(getApplicationContext(), mProductList);
        lvProduct.setAdapter(adapter);

    }
}
