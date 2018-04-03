package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                Button button = (Button) findViewById(R.id.button);

        }
        public void onNextActivityClick(View view)
        {
                Intent intent = new Intent(MainActivity.this, Show_list_activity.class);
                startActivity(intent);
        }

}