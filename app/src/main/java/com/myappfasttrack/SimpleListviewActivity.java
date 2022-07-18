package com.myappfasttrack;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SimpleListviewActivity extends AppCompatActivity {

    ListView listView;
    String strLang[] = {"Android","Java",".net","PHP","C","C++","Python",
            "Android","Java",".net","PHP","C","C++","Python",
            "Android","Java",".net","PHP","C","C++","Python",
            "Android","Java",".net","PHP","C","C++","Python"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_listview);
        listView = findViewById(R.id.list_view);

      // ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,strLang);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.raw_list,R.id.tv_data,strLang){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View myView = super.getView(position, convertView, parent);

                if(position %2 == 1)
                {
                    myView.setBackgroundColor(Color.parseColor("#FFFFFF"));

                }
                else{
                    myView.setBackgroundColor(Color.parseColor("#FF989797"));

                }
                return myView;
            }

        };
        listView.setAdapter(arrayAdapter);


    }
}