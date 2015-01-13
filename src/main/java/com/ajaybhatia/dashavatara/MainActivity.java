package com.ajaybhatia.dashavatara;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.ajaybhatia.dashavatara.helpers.MyAdapter;


public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = getListView();

        MyAdapter adapter = new MyAdapter(this);
        listView.setAdapter(adapter);
    }

}
