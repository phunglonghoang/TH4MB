package com.example.a2051052049;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    TextView txtMsg;
    String[] items = {"Cơ sở lập trình", "Cơ sở dữ liệu",
            "Cấu trúc dữ liệu", "Lập trình hướng đối tượng"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items));
        txtMsg = (TextView) findViewById(R.id.txtMsg);
    }



    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String text = "Position: " + position + " " + items[position];
        txtMsg.setText(text);
    }

}
