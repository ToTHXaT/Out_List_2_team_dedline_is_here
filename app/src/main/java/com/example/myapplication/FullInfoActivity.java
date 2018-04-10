package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FullInfoActivity extends AppCompatActivity {
    private ListView lvProduct3;
    private ListAptekAdapter adapter3;
    public static List<Apteki> mAptekiList3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_info);


        lvProduct3 = (ListView)findViewById(R.id.List_of_aptek);
        mAptekiList3 = new ArrayList<>();
        TextView tvMed_name = findViewById(R.id.Med_name);

        tvMed_name.setText(Show_list_activity_price.nextActivityProduct.getName());
        //Заполняете mAptekiList3
        //
        for(int i = 0;i<10;i++){
            mAptekiList3.add(new Apteki(String.valueOf(i),String.valueOf(-i),String.valueOf(i+50)));
        }
        adapter3 = new ListAptekAdapter(getApplicationContext(), mAptekiList3);
        lvProduct3.setAdapter(adapter3);



    }
}
