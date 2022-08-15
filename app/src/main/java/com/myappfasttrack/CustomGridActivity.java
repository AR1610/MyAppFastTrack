package com.myappfasttrack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.myappfasttrack.model.LangModel;

import java.util.ArrayList;

public class CustomGridActivity extends AppCompatActivity {

    GridView gridView;
    String strLang[] = {"Android", "Java", "Python", "PHP", "C", "C++", "IOS"};
    int imgLang[] = {R.mipmap.ic_launcher_round, R.drawable.ic_java, R.drawable.ic_python,
            R.drawable.ic_php, R.drawable.ic_c, R.drawable.ic_cc, R.drawable.ic_ios};
    ArrayList<LangModel> langModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_grid);
        gridView = findViewById(R.id.grid_view);
        langModelArrayList = new ArrayList<LangModel>();
        for (int i = 0; i < strLang.length; i++) {

            LangModel langModel = new LangModel(strLang[i], imgLang[i]);
            langModelArrayList.add(langModel);
        }

        MyGridAdapter myGridAdapter = new MyGridAdapter(this, langModelArrayList);

        gridView.setAdapter(myGridAdapter);


    }
}