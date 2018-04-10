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
    public static List<Product> mProductList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list_activity);

        ProgressBar prgr = (ProgressBar)findViewById(R.id.progressBar);
        prgr.getIndeterminateDrawable().setColorFilter(0xFF5C5CFF, android.graphics.PorterDuff.Mode.MULTIPLY);
        prgr.setVisibility(ProgressBar.INVISIBLE);

        lvProduct = (ListView)findViewById(R.id.listview_product);
        mProductList = new ArrayList<>();
        //Add sample data for list

    }
    int strtI = 0;//////////////удалтиь

    public void onReady(View view){

        //Работает парсер................

        //Когда начинает работать
//        prgr.setVisibility(ProgressBar.VISIBLE);

        //Когда закончит
//        prgr.setVisibility(ProgressBar.INVISIBLE); хотя можно наверно и не делать тк все равно переходит на сл активити

        //mProductList.get(<id>).setPrice() Используйте чтоб впихнуть цену на соотв место(всё есть строка)
        Intent intent = new Intent(Show_list_activity.this, Show_list_activity_price.class);
        startActivity(intent);
    }
    public void onPlus(View view){
        //mProductList.clear(); если надо очистить
        //mProductList.add(new Product(i , <name>,<price>(в этой activity оставить пустой), <Kol-vo>); заполнять так
        //Add elements
        //Add elements
        //Add elements
        //Add elements
        //Add elements
        //Add elements
        //Изменяй mProductList и так будет менятся список


        //////////Пример. после просмотра удалить. strI тоже удалить
        int i = strtI++;
        mProductList.add(new Product(i , String.valueOf(i)+"lololololololdldldldldldlldfdfsdfdsfsdfs","", String.valueOf(i + 2)));
        //////////


        ////////////////не трогать вообще
        adapter = new ProductListAdapter(getApplicationContext(), mProductList);
        lvProduct.setAdapter(adapter);
        ////////////////
    }
}
